#!/bin/bash

apply_common() {
  kubectl apply -f deploy/enviroment/01-zookeeper.yaml
  kubectl apply -f deploy/enviroment/02-kafka.yaml
  kubectl apply -f deploy/enviroment/03-mysql-secret.yaml
  kubectl apply -f deploy/enviroment/04-mysql-storage.yaml
  kubectl apply -f deploy/enviroment/05-mysql-deployment.yaml
}

change_namespace() {
  kubens aincrad
}

apply_kind() {
  kubectx kind-kind
  change_namespace
  apply_common
}

apply_minikube() {
  kubectx minikube
  change_namespace
  apply_common
}

delete_common() {
  kubectl delete -f deploy/enviroment/01-zookeeper.yaml
  kubectl delete -f deploy/enviroment/02-kafka.yaml
  kubectl delete -f deploy/enviroment/03-mysql-secret.yaml
  kubectl delete -f deploy/enviroment/04-mysql-storage.yaml
  kubectl delete -f deploy/enviroment/05-mysql-deployment.yaml
}

delete_kind() {
  kubectx kind-kind
  change_namespace
  delete_common
}

delete_minikube() {
  kubectx minikube
  change_namespace
  delete_common
}

if [ "$1" == "gt" ]; then
  apply_kind
elif [ "$1" == "tb" ]; then
  apply_minikube
elif [ "$1" == "all" ]; then
  apply_kind
  apply_minikube
elif [ "$1" == "delete-gt" ]; then
  delete_kind
elif [ "$1" == "delete-tb" ]; then
  delete_minikube
elif [ "$1" == "delete-all" ]; then
  delete_kind
  delete_minikube
else
  echo "Opção inválida. Informe \"gt\", \"tb\" ou \"all\""
  echo ""
  echo "Exemplo: "
  echo "$ ./k8s-deploy-dev.sh gt"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh tb"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh all"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh delete-gt"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh delete-tb"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh delete-all"
fi

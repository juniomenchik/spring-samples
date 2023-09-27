#!/bin/bash

apply_common() {
  kubectl apply -f deploy/dev/secret.yaml
  kubectl apply -f deploy/dev/deployment.yaml
  kubectl apply -f deploy/dev/service.yaml
  kubectl apply -f deploy/dev/config-map.yaml
  kubectl apply -f deploy/dev/secret-map.yaml
}

change_namespace() {
  kubens aincrad
}

#apply_kind() {
#  kubectx kind-kind
#  change_namespace
#  apply_common
#  kubectl apply -f deploy/dev/config-map.gt.yaml
#  kubectl apply -f deploy/dev/ingress.gt.yaml
#}

apply_minikube() {
  kubectx minikube
  change_namespace
  apply_common
  kubectl apply -f deploy/dev/config-map.tb.yaml
  kubectl apply -f deploy/dev/ingress.tb.yaml
}

delete_common() {
  kubectl delete -f deploy/dev/secret.yaml
  kubectl delete -f deploy/dev/deployment.yaml
  kubectl delete -f deploy/dev/service.yaml
  kubectl delete -f deploy/dev/config-map.yaml
  kubectl delete -f deploy/dev/secret-map.yaml
}

#delete_kind() {
#  kubectx kind-kind
#  change_namespace
#  delete_common
#  kubectl delete -f deploy/dev/config-map.gt.yaml
#  kubectl delete -f deploy/dev/ingress.gt.yaml
#}

delete_minikube() {
  kubectx minikube
  change_namespace
  delete_common
  kubectl delete -f deploy/dev/config-map.tb.yaml
  kubectl delete -f deploy/dev/ingress.tb.yaml
}

if [ "$1" == "all" ]; then
#  apply_kind
  apply_minikube
elif [ "$1" == "delete-all" ]; then
#  delete_kind
  delete_minikube

else
  echo "Opção inválida. Informe \"gt\", \"tb\" ou \"all\""
  echo ""
  echo "Exemplo: "
  echo "$ ./k8s-deploy-dev.sh all"
  echo "ou"
  echo "$ ./k8s-deploy-dev.sh delete-all"
fi

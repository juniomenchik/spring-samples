import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalyzer {
    // Defina os tokens da linguagem
    private static Set<String> tipoDados = new HashSet<>();
    private static String saida = "write";
    private static String entrada = "read";
    private static String atribucao = "<<";
    private static Set<String> opAritmetico3 = new HashSet<>();
    private static Set<String> opAritmetico2 = new HashSet<>();
    private static Set<String> opAritmetico1 = new HashSet<>();
    private static Set<String> opAritmetico = new HashSet<>();
    private static Set<String> opRelacional = new HashSet<>();
    private static Set<String> opLogico = new HashSet<>();
    private static Set<String> desvioCondicional = new HashSet<>();
    private static String inicioBloco = "{";
    private static String fimBloco = "}";
    private static Set<String> repeticao = new HashSet<>();
    private static Set<String> condicionalAninhada = new HashSet<>();
    private static String p1 = "(";
    private static String f1 = "[";
    private static String p2 = "[";
    private static String f2 = "]";
    private static Set<String> outrosTokens = new HashSet<>();
    private static String finalInstrucao = ";";
    private static String inicioVariavel = "@";

    static {
        tipoDados.add("decimal");
        tipoDados.add("dpoint");
        tipoDados.add("simbol");
        tipoDados.add("word");
        tipoDados.add("state");

        opAritmetico3.add("+");
        opAritmetico3.add("-");
        opAritmetico2.add("*");
        opAritmetico2.add("/");
        opAritmetico1.add("%");
        opAritmetico1.add("^");
        opAritmetico.add("++");
        opAritmetico.add("--");

        opRelacional.add("=");
        opRelacional.add(">");
        opRelacional.add("<");
        opRelacional.add(">=");
        opRelacional.add("<=");
        opRelacional.add("!=");

        opLogico.add("not");
        opLogico.add("and");
        opLogico.add("||");
        opLogico.add("xor");
        opLogico.add("nor");
        opLogico.add("nand");

        desvioCondicional.add("if");
        desvioCondicional.add("else");

        repeticao.add("for");
        repeticao.add("while");
        repeticao.add("do");

        condicionalAninhada.add("switch");
        condicionalAninhada.add("case");
        condicionalAninhada.add("othercase");

        outrosTokens.add("root");
        outrosTokens.add("logarithm");
        outrosTokens.add("swap");
        outrosTokens.add("const");
        outrosTokens.add(":");
        outrosTokens.add("main");
        outrosTokens.add("return");
        outrosTokens.add("pause");
        outrosTokens.add("rest");
        outrosTokens.add("include");
        outrosTokens.add("break");
        outrosTokens.add("continue");
        outrosTokens.add("random");
        outrosTokens.add("true");
        outrosTokens.add("false");
        outrosTokens.add(",");

    }


    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter validOutput = new BufferedWriter(new FileWriter("valid_output.txt"));
            BufferedWriter errorOutput = new BufferedWriter(new FileWriter("error_output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Divide a linha em palavras usando espaços como delimitadores

                for (String word : words) {

                    if(word.startsWith(inicioVariavel)){
                        String regex = "^[a-zA-Z_@]+$";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(word);
                        if (matcher.matches()) {
                            System.out.println("A String contém apenas letras do alfabeto e/ou underline.");
                            //se word contem + de 2 caracter, e menos de 12, ela e valida
                            if (word.length() > 1 && word.length() < 12) {
                                validOutput.write(word + "\n");
                                System.out.println("Variavel -> " + word);
                            } else {
                                errorOutput.write(word + "\n");
                            }
                        } else {
                            System.out.println("A String contém caracteres inválidos.");
                            errorOutput.write(word + "\n");
                        }

                    }else {

                        if (tipoDados.contains(word)) {
                            // A String pertence ao grupo "tipoDados"
                            validOutput.write(word + "\n");
                        } else if (opAritmetico3.contains(word)) {
                            // A String pertence ao grupo "opAritmetico3"
                            validOutput.write(word + "\n");
                        } else if (opAritmetico2.contains(word)) {
                            // A String pertence ao grupo "opAritmetico2"
                            validOutput.write(word + "\n");
                        } else if (opAritmetico1.contains(word)) {
                            // A String pertence ao grupo "opAritmetico1"
                            validOutput.write(word + "\n");
                        } else if (opAritmetico.contains(word)) {
                            // A String pertence ao grupo "opAritmetico"
                            validOutput.write(word + "\n");
                        } else if (opRelacional.contains(word)) {
                            // A String pertence ao grupo "opRelacional"
                            validOutput.write(word + "\n");
                        } else if (opLogico.contains(word)) {
                            // A String pertence ao grupo "opLogico"
                            validOutput.write(word + "\n");
                        } else if (desvioCondicional.contains(word)) {
                            // A String pertence ao grupo "desvioCondicional"
                            validOutput.write(word + "\n");
                        } else if (repeticao.contains(word)) {
                            // A String pertence ao grupo "repeticao"
                            validOutput.write(word + "\n");
                        } else if (condicionalAninhada.contains(word)) {
                            // A String pertence ao grupo "condicionalAninhada"
                            validOutput.write(word + "\n");
                        } else if (outrosTokens.contains(word)) {
                            // A String pertence ao grupo "outrasTokens"
                            validOutput.write(word + "\n");
                        } else if (word.equals(saida)){
                            validOutput.write(word + "\n");
                        } else if (word.equals(entrada)){
                            validOutput.write(word + "\n");
                        } else if (word.equals(atribucao)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(inicioBloco)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(fimBloco)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(p1)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(f1)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(p2)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(f2)) {
                            validOutput.write(word + "\n");
                        }else if (word.equals(finalInstrucao)) {
                            validOutput.write(word + "\n");
                        }else {
                            // A String não pertence a nenhum dos grupos
                            errorOutput.write(word + "\n");
                        }
                    }
                }
            }

            reader.close();
            validOutput.close();
            errorOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

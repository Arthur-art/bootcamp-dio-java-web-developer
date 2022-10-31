![image](https://user-images.githubusercontent.com/54858003/197652339-7bca38b2-b12b-461c-99f5-9561eda7c85d.png)


# Documentação do projeto

- Link para a documentação do curso: [Java Básico - Java Básico (gitbook.io)](https://glysns.gitbook.io/java-basico/)

## 1 - Configurando o ambiente
- Instalando o JDK
  - https://www.oracle.com/br/java/technologies/downloads/#java19
- Instalando o IntelliJ
  - https://www.jetbrains.com/pt-br/idea/
  - Após instalar o IntelliJ, crie um novo projeto.

## 2 - Extensões do Intellij
- Atom
- Git tool box
- Key promoter
- Dracula theme 
- Rainbow Brackets

## 3 - Projetos Java com Gradle
- Instalando o Gradle na maquina
- No caminhdo da pasta GradleCourse\Aula1\01-Testing_Gradlew, digitar no terminal power shel: ./gradlew
- Verificando version: ./gradlew -version

## 4 - Trabalhando com Junit - Testes unitarios
- Pesquisar por Junit Jupiter Engine no MVN repository 
  - Link: https://mvnrepository.com/
- Configuração Gradle:
```js
// https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'

```
- Na pasta lib - build.gradle, adicionar a dependencia.


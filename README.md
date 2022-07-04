# TRABAJO-07
SERVICIO COGNITIVO

Text to Speech
Texto a voz


Siga estos pasos para instalar el SDK de voz para Java mediante Apache Maven:

Instalación de Apache Maven.
Abra un símbolo del sistema donde quiera el nuevo proyecto y cree un archivo pom.xml.
Copie el contenido XML siguiente en pom.xml:
XML

Copiar
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.microsoft.cognitiveservices.speech.samples</groupId>
    <artifactId>quickstart-eclipse</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <build>
        <sourceDirectory>src</sourceDirectory>
        <plugins>
        <plugin>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.7.0</version>
            <configuration>
            <source>1.8</source>
            <target>1.8</target>
            </configuration>
        </plugin>
        </plugins>
    </build>
    <repositories>
        <repository>
        <id>maven-cognitiveservices-speech</id>
        <name>Microsoft Cognitive Services Speech Maven Repository</name>
        <url>https://azureai.azureedge.net/maven/</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
        <groupId>com.microsoft.cognitiveservices.speech</groupId>
        <artifactId>client-sdk</artifactId>
        <version>1.22.0</version>
        </dependency>
    </dependencies>
</project>
Ejecute el siguiente comando de Maven para instalar el SDK de Voz y las dependencias.
Consola

Copiar
mvn clean dependency:copy-dependencies

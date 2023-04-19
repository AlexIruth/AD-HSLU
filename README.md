# Java Projekt-Template fuer OOP/PLAB, PRG, AD, VSK, SWDE und SWDA

## Zweck
Dieses Projekt dient in den Modulen OOP/PLAB, PRG, AD, VSK, SWDE und SWDA als 
Template fuer einfache Java-Projekte. Es nutzt einen auf 
[Apache Maven](https://maven.apache.org/) basierenden (und somit IDE-unabhaengigen) 
Build und definiert die dafuer notwendige, standardisierte Verzeichnisstruktur.

## Distribution / Download
Die jeweils aktuelle Version steht auf [SWITCHdrive](https://drive.switch.ch/) zur Verfügung:
https://drive.switch.ch/index.php/s/nz0UdWDlSQ9ogDX?path=%2F15_maven_template

## Verwendung
Das Projekt kann einfach kopiert und umbenannt werden. In NetBeans, IntelliJ und 
Visual Studio Code kann es **direkt** geoeffnet werden, in Eclipse  ist 
ein **Import** des Projektes (als `Existing Maven Project`) notwendig. 
Die beste (weil vollständige) Integration ist in NetBeans gegeben, in allen
anderen IDE's kann der Maven Build manuell ausgeloest werden. Nach dem Kopieren
in ein neues Verzeichnis (für ein neues Projekt) wird sehr empfohlen:
* den Namen des Verzeichnisses, 
* den Namen des Projektes in der IDE, sowie 
* die `ArtifactID` und `Name` (zwei Elemente im `pom.xml`)

zwecks Vereinfachung und Konsistenz **synchron** zu halten.
In NetBeans erreichen Sie das z.B. durch ein einfaches "Rename"-Refactoring. 
Sie koennen es aber auch von Hand mit einem Texteditor (z.B. notepad) erledigen.

Hinweis: Sobald Sie eigene Klassen und Testfaelle ergaenzt haben, macht es Sinn
die fuer Demozwecke enthaltenen Demo-Klassen entfernen.

## Bereits enhaltene Libraries (Dependencies)
* JUnit 5 - https://junit.org/junit5/
* JUnit Pioneer - https://junit-pioneer.org/
* AssertJ - https://assertj.github.io/doc/
* EqualsVerifier - https://jqno.nl/equalsverifier/
* Logging Framework - https://logging.apache.org/log4j/2.x/
* MutabilityDetector - https://github.com/MutabilityDetector/MutabilityDetector
* Log Captor - https://github.com/Hakky54/log-captor

## Integrierte Analysewerkzeuge (Code Qualitaet)
* Checkstyle - https://checkstyle.sourceforge.io/
* PMD - https://pmd.github.io/
* JaCoCo - https://www.eclemma.org/jacoco/
* Spotbugs - https://spotbugs.github.io/
* Snyk - https://snyk.io/ (benoetigt Account und zusaetzliche Konfiguration)


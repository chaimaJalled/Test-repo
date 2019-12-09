# Généralités

Le diagramme de classe conçu et l'ensemble des exigences fonctionnelles satisfaites sont détaillés dans le GitHub du 1er groupe :
https://github.com/ilyesAj/sessionu

## Installation et Prérequis:
 
**1-Installation java 8**
**2-Installation eclipse**
**3-Installation de SQLite 3**

Pour plus de détails sur l'installation de SQLite vous pouvez consulter le tutoriel suivant: https://www.sqlitetutorial.net/download-install-sqlite/

**4-Installation de Maven**

Ce tutoriel explique l'installation de Maven + l'ajout d'une nouvelle variable d'environnement pour pouvoir utiliser la commande mvn :
http://www.opentuto.com/installer-apache-maven-sur-windows/



## Exploitation du code

**1-Introduction**

Ce module Java est un projet Maven qui présente le coté serveur de l'application Sessions.
Il expose des API REST qui peuvent etre sollicitées et exploitées par le client qui est une IHM.

**2-Technologies et outils utilisés**

- **a-SpringBoot**
Un framework qui facilite le développement d'applications
https://spring.io/projects/spring-boot

- **b-Swagger**
Outil pour créer, concevoir et documenter des API REST (exigence non fonctionnelles demandée)

**3-Structure du code et packages**

**a-Squellette**

Il s'agit d'un projet Maven .Son fichier de configuration principal est le pom.xml qui contient :
- Les métadonnées du livrable (un ficher jar) :
	* groupId : fr.isty.iatic5.archilog
	* artifactId : sessions
	* version :  0.0.1-SNAPSHOT
	
- les dépendances vers des autres libraires par exemple celle de SqlLite :
<dependency>
	<groupId>org.xerial</groupId>
	<artifactId>sqlite-jdbc</artifactId>
	<version>3.27.2.1</version>
</dependency>

Le jar correspondant à cete dépendance va etre téléchargé depuis le reposiory maven et intégré
dans le répertoire Maven Dependancies du projet ( idem pour les autres librairies)

- le framework SpringBoot grace à la balise suivante :
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.1.0.RELEASE</version>
</parent>

**b-Configuration**

Le sous-package config sous le package principale sessions (se trouvant dans src/main/java) contient deux classes
de configuration.
- La classe SwaggerConfig contient la configuration de Swagger notammment des descriptions techniques et le package
contenant les controllers à scanner.
Elle applique et respecte la spécification internationnelle OpenAPI.

- La classe SqlUtils contient la configuration pour se connecter à la base de données ainsi que la fonction de connexion
et la fonction de déconnexion.

- Le fichier de conf application.properties (dans src/main/ressouces) est le fichier de configuration applicative
par défault à SpringBoot.
Par exemple, dedans on peut mettre le parametre server.port qui permet de définir le port dans le hostname.
Par défaut, c'est le port 8080 : hotname en local par défaut : http://localhost:8080/

- Le fichier data.db contient les informations sur la base de données data : desscription des tables + leurs contenus
(quelques lignes initialisées). C'est un fichier initialisé et transmis par le 1er groupe


**c-Controllers**

Un Controller est une classe qui conçoit et crée le contrat de service d'une API REST.
Tous les controllers sont implémentés dans les sous-package controller.
Il permet de définir son nom, son path, son type (POST, GET , DELETE...),ses parametres d'appel, son corps si besoin ainsi que ses codes de retour.
Ces spécifications sont assurées par des annotations de la libraire swagger.
Il permet également de spécificer son comportement en appelant le Service correspondant.

Exemples d'URL appelés par le client:
Créer Classe (mode Post):	https://localhost:8080/manipulClasse/create/newClasse
Afficher une Classe (mode Get):	https://localhost:8080/manipulClasse/get/getClasse
Effacer une classe (mode Delete):	https://localhost:8080/manipulClasse/delete/deleteClasse

**d-Services**

Un Service présente les fonctionnalités "Back"  et spécifie les comportements d'une API Rest.
Tous les services sont implémentés dans les sous-package service.
Dans ce contexte, un service est crée par objet cible.
Un service spécifie le constructeur et  les attribus d'un objet. Il appelle aussi les méthodes CRUD
(CREAT, READ, UPDATE and DELETE) impémentés dans la classe SessionImpementation.

Exemple:
CreateClasse
DeleteClasse 
Se sont des fonctions qui permettent respectivement de créer et supprimer une Classe, elles sont appelées lorsqu'on accède à l'URL convenable.

**e-Classe Main**

Il s'agit d'une classe sous le package principale Session.
C'est une SpringApplication qui permet de lancer le serveur Tomcat intégrée dans le framework SpringBoot.

**4-Exécution**

Il y a deux possiblités pour exécuter et arreter le serveur :

**a-IDE**

Pour l'exécuter ou l'arrêter , il suffit de lancer ou arrêter la classe Main sur Eclipse. Ces deux commandes s'exécutent dans la racine du projet.

**b-commande**

Commande d'exécution (via Maven) :
mvn spring-boot:run

Commande d'arret (via Maven) :
mvn spring-boot:stop

**c-Test**

Pour documenter l'API: Il suffit d'appler cet URL : http://localhost:8080/swagger-ui.html#/
Vous aurez une interface qui illustre les fonctions créer lors d'un POST, GET et DELETE.
POST et DELETE on besoin d'un body c'est là où nous mettons le contenu à créer ou à supprimer contrairement à la méthode GET qui n'a pas besoin d'un body pour s'exécuter.
Vous auriez
# Point important

Dans le fichier application.properties vous avez la possibilité de modifier le port du serveur. Ici est configuré à 8080 
       
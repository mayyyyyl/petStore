# petStore

 ## Rendu du Tp petStore sur Jpa et Hibernate
 
 ### Lancer le projet
 
 Prérequis: créer une base de données petstore
 
 
  - ` git clone https://github.com/mayyyyyl/petStore.git `
  -  ouvrir le dossier
  - dans resources > META-INF > persistance.xml
        modifier les property suivantes afin de vous connecter à mariadb:
           
           `<property name="javax.persistence.jdbc.url" value="jdbc:mariadb://localhost:3306/petstore" />
            <property name="javax.persistence.jdbc.user" value="" />
            <property name="javax.persistence.jdbc.password" value="" />`
  
  - lancer le fichier main.java
  
  
  ### Résultat de la base de données peuplée
  
  ![Capture d'écran_20230221_230306](https://user-images.githubusercontent.com/90853285/220469080-6b52d762-586b-4ad8-9580-38ff7e2da0b3.png)
  
  ### Résultat de la requête sélectionnant tous les animaux d'une animalerie
  
  ![Capture d'écran_20230221_230814](https://user-images.githubusercontent.com/90853285/220469740-95a9e160-3dd0-4b2b-b71d-b33d68f652dd.png)
  
  
            

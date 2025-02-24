# Injection des dépendances 
###### Ce projet illustre le concept d'injection des dépendances en Java en utilisant deux méthodes : instanciation statique et instanciation dynamique.
### Structure du projet
#### couche Dao 
![image](https://github.com/user-attachments/assets/477de817-789a-46d5-abea-c4ff61b69620)
une interface IDao avec une méthode getData() qui retourne des données.
une classe DaoImpl qui implémente IDao et fournit une implémentation concrète de getData().
#### couche métier
une interface IMetier avec une méthode calcul().
une classe MetierImpl qui implémente IMetier et utilise IDao pour obtenir les données nécessaires.
#### couche presentation 
a. Par instanciation statique
  Dans la classe principale (Main), on instancie manuellement DaoImpl et on l'affecte à MetierImpl via un setter.
  Cela signifie que MetierImpl dépend directement de DaoImpl, ce qui est une approche simple mais moins flexible.
b. Par instanciation dynamique
  On utilise la réflexion Java pour instancier dynamiquement DaoImpl à partir d'un fichier de configuration (config.txt).
  Cette méthode permet de modifier l’implémentation de IDao sans modifier le code source de MetierImpl, rendant l'application plus modulaire et maintenable.
  


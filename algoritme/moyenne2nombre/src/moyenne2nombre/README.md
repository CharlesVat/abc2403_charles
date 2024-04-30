# Exerccie en calcul de algo logo 

# Exercice 1.1 : hello World
écrire un programme qui affiche "hello World"
'''
ECRIRE "Hello world
'''

# Exercicce 1.2 : hello you
l'utilisateur est invité à saisir son prénom dans la console.

le programme affiche "Bonjour" suivi du prénom saisi

'''
variable 
prenom est une CHAINE DE CARACTERES

TRAITEMENT
ECRIRE"saisissez votre prénom"
LIRE prénom
si Prenom.LONGEUR > 2 alors
ECRIRE " bonjour",prenom, "."
SINON
    ECRIRE "Prénom invalide
'''

# Exercice 1.3
variable
 premierNombre est un NOMBRE ENTIER NON SIGNE
 secondNombre est un NOMBRE ENTIER NON SIGNE
 resultat est un NOMBRE REEL

`
 TRAITEMENT

ECRIRE "Saisissez un premier nombre entier"
LIRE premierNombre
ECRIRE "saisissez le second nobre entier"
LIRE secondNombre
 resultat := (premier nombre+second nombre)/2 
ECRIRE "la moyenne de ", premier nombre, " et ", second nombre,"est : ",résultat "."


# Exercice 1.4

VARIABLE
rayon est un NOMBRE ENTIER
aire est un NOMBRE ENTIER
volume est un NOMBRE ENTIER

TRAITEMENT

ECRIRE "saisissez le rayon"
LIRE rayon
aire:= 4*3,14*rayon²
volume := (4*3,14*rayon³)/3
ECRIRE aire, volume


# Exercice 1.5

VARIABLE
rayon est un NOMBRE ENTIER
angle est un NOMBRE ENTIER
aire est un NOMBRE ENTIER

TRAITEMENT
ECRIRE "saisissez le rayon
LIRE rayon
ECRIRE "saisissez l'angle"
LIRE angle
aire:= (3,14*rayon²*angle)/360
ECRIRE aire

# Exercice 1.6
VARIABLE
A est un nombre entier
B est un nombre entier
C est un nombre entier


TRAITEMENT
ECRIRE"saisissez A"
lire A
ECRIRE "saisissez B"
LIRE B
ECRIRE A , B
C:=A
A:=B
B:=C

ECRIRE A, B

# exercice 2.1


VARIABLE
Nombres est NOMBRE ENTIER


TRAITEMENT
ECRIRE "saissisez un nombre"
LIRE Nombres
SI Nombres >=0 alors
ECRIRE Nombres " est positif"
SINON
ECRIRE Nombres, " est négatif"

# exercice 2.2

VARIABLE
NombresA est un NOMBRE ENTIER
NombresB est un NOMBRE ENTIER
Resultat est un NOMBRE REEL
TRAITEMENT

ECRIRE "Saissisez un premier nombre"
LIRE NombresA
ECRIRE "Saissisez un second nombre"
LIRE NombreB
Resultat := NombreA + NombreB
SI Resultat >=0 alors
ECRIRE Resultat,"est positif"

# exercice 2.3

VARIABLE
Age est un NOMBRE ENTIER
Categorie est une CHAINE DE CARACTERE

TRAITEMENT
ECRIRE "saississez votre âge:"
LIRE Age
SI AGE <5 alors Categorie = "debutant"
OU SI ge<=7 alors  Categorie = "poussin"
OU SI age <=9 alors Categorie = "BENJAMIN"
ou SI Age <=11 alors Catgorie = "Pupille"
ou SI Age <=13 alors Catgorie = "Minime"
Ou si Age <=15 alors Categorie = "cadet"
Ou si Age <=17 alors Categorie = "junior"
Ou si Age <=19 alors categorie = "Sénior"
Ou si Age <=35 alors catégorie = "Vétéran"
sinon 
Catogrie="trop jeune"

ECIRE "vous êtes", Categorie

# exercice 2.4

VARIABLE
Heure est un nombre entier
Minute est un nombre entier
Resultat est un nombre entier

TRAITEMENT

ECRIRE "entrez l'heure"
LIRE Heure
ECRIRE "Entrez les minutes"
Lire Minute

Resultat := Minute+3

Si Heure <=24 OU Minute <=60 ALORS ECRIRE"les données saisies sont invalide"

SINON
Si resultat <=60 ALORS resultat = Resultat - 60 Et Heure++1 

Si Heure =24 ALORS Heure=0


RESULTAT

Ecrire "dans 3minute il serra : " Heure"h"Resultat"

# exercice 2.5

10 <=0.10 11 -20 0.09 21<= 0.08

VARIABLE

Copie est un NOMBRE ENTIER
Facture est un NOMBRE ENTIER
Prix est un NOmbre entier
TRAITEMENT

ECRIRE"Saisisez le nombre de PHotocopie"
LIRE Copie
SI Copie <= 10 ALORS prix = 0,10
SINON SI Copie >10 ALOR prix= 0,09+(0,10*10)
SINON SI copie >30 Alors prix = 0,08+(0,10*10) +(0,009*20)


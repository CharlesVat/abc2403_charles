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
SI Age >=35 alors catégorie = "Vétéran" 
SINON si Age >=19 alors categorie = "Sénior"
SINON SI Age >=17 alors Categorie = "junior"
SINON SI Age >=15 alors Categorie = "cadet"
SINON SI Age >=13 alors Catgorie = "Minime"
SINON SI Age >=11 alors Catgorie = "Pupille"
SINON  SI age >=9 alors Categorie = "BENJAMIN"
SINON  SI Age >=7 alors  Categorie = "poussin"
SINON SI AGE >=5 alors Categorie = "debutant"
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
Facture = prix*Copie
ecrire "vous devez", Facture

# correctio de 2.5

CONSTANTES

P1 est un REEL <-- 0.10
P2 est un REEL <-- 0.09
P3 est un REEL <-- 0.08

VARIABLES

nombreDeCopies est un ENTIER
MontantDeLaFacture est unn ENTIER

TRAITEMENT

ECRIRE "Saisissez le nombre de photocopies: "
LIRE nombreDeCopies

SI nombreDeCopies <= ALORS montantDeLaFacture <-- nombreDeCopies*P1
SINON SI nombreDeCopies <=30 
ALORS 
MontantDeLaFacture <-- 10*P1 + 5nombreDeCopies -10) *P2
SINON
 MontantDeLaFacture <-- 10*P1 + 20 * P2(nombreDeCopies -30)*P3
FIN SI

ECRIRE"a payer: ", MontantDeLaFacture, "€"


# exercice 2.6

VARIABLE

CandidatA est un ENTIER
CandidatB est un ENTIER
CandidatC est un ENTIER
CandidatD est un ENTIER
Resultat est une CHAINE DE CARACTERES

TRAITEMENt

ECRIRE "Saisissez le résultat pour CandidatA"
LIRE CandidatA

ECRIRE "Saisissez le résultat pour CandidatB"
LIRE CandidatB

ECRIRE "Saisissez le résultat pour CandidatC"
LIRE CandidatC

ECRIRE "Saisissez le résultat pour CandidatD"
LIRE CandidatD



SI  50> cadidatA ALORS
	Resultat = élu 
SINON SI 12,5>=CandidatA ET CandidatA>candidatB ET candidatA>candidatC ET candidatA>candidatD ALORS
	REsultat = favorable
SINON SI 12,5>=candidatA
	Resultat =défavorable
SINON
	Resultat= éliminé

ECRIRE"LE candidat A est ", Resultat, "avec", CandidatA, pourcent"

# excercice 2.7
ROUGE=accident avec moin de 2ans et 25>=, 25< aucun accident et moin de 2 ans et 2accident pour 25>= et 2ans+
ORANGE= 2ans et 25<, 25>= avec moin 2ans sans aucun accident,25>= 2ans plus avec un accident et rouge +5ans
VERT= 25>= 2ans plus avec aucun accident orange+5ans
BLEU= VERT +5 ANS D'ANCIENNETE 
AUCUN=le reste


25< permis moin de 2ans = rouge si aucun accident sinon aucun
25< plus de 2ans ou 25=> mais moin 2ans=orange rouge en cas d'accident sinon aucun
25>= 2an=> =vert aucun accident, 1=orange, rouge=2 et aucun plus


VARIABLE
Age est un chiffre entier
Permis est un chiffre entier
Ancien est un chiffre entier
Forfait est une chaine de caractére
Accident est un chiffre entier
TRAITEMENT

ECRIRE"Saisissez votre âge:"
LIRE Age
ECRIRE"Saisissez combien d'année vous êtes tiutilaire du permis"
LIRE Permis
ECRIRE"Saisissez vos année d'ancienneté"
LIRE Ancien
ECRIRE"nombre d'accident"
LIRE Accident

SI Age>=25  ET Permis>=2 ET accident =0 
alors 
Forfait = VERT 
sinon forfait = ORANGE

si Age<25 ET Permis>=2 ET accident 0a
alors
Forfait = ORANGE
sinon
Forfait= ROUGE

Si Age<25 ET Permis<2 ET Accident=0 ou Age<=25 ET Permis>=2 ET Accident=2 ALORS
Forfait= ROUGE
SINON 
Forfait = "NON ELIGIBLE"

SI Ancien>=5 Et forfait = VERT alors
Forfait = BLEU
SINON SI ancien>=5 ET Forfait = ORANGE alors
FORFAIT= VERT 
SINON SI ancien>=5 ET Forfait = ROUGE ALORS
Forfait = ORANGE

ECRIRE"vous assurée le forfait :", Forfait


#Exercice 2.8


VARIABLE

Annee est un nombre entier
Mois est un nombre entier
Jours est un nombre entier
Date estune chaine de caractére

TRAITEMENT

ECRIRE "sasisissez l'année"
LIRE Annee
ECRIRE"Sasissez le mois en nombre"
LIRE Mois
ECRIRE"sasissez le jour"
LIRE Jours

SI Annee%4!=0 ET Mois=02 ET Jours>=29 OU Mois==04 OU Mois==06 OU Mois==09 OU Mois==11 ET Jours>30 ALORS
DATE ="Date non valide"
SINON
DATE="Date valide!"

ECRIRE "c'est une ", Date


#Exercice 3.1


VARIABLE
Nombre est nombre entier

TRAITEMENT
FAIRE
 ECRIRE"Saisissez un chiffre entre 1 et 3
 LIRE Nombre
 TANT QUE Nombre>3 OU Nombre<1  SINON
 FIN FAIRE
 
 ECRIRE"Bravo, vous avez réussi"

#Exercice 3.2

VARIABLE
Nombre est un entier

TRAITEMENT
FAIRE
ECRIRE"Saisissez un nombre entre 10 et 20"
	LIRE Nombre
	 SI NOMBRE>20 ALORS ECRIRE"plus petit"
	 SINON SI Nombre<10 ALORS ENCRIRE "plus grand!"
	TANT QUE Nombres<10 ou Nombres>20
	FIN FAIRE
	ECRIRE"yes, you did it!"

#Exercice 3.3

VARIABLE
Nombres est un entier
Nombresup est un entier
TRAITEMENT
ECRIRE"Saisissez un nombre"
LIRE nombre
Nombresup:=nombres+10
ECRIRE "les 10 prochain chiffre de",Nombres,"sont:"
TANT QUE Nombres!=Nombresup ALORS
Nombres++
ECRIRE Nombre
FIN TANT

POUR  de Nombre à Nombresup, Nombre++
ECRIRE Nombre
FIN POUR


#Exercice 3.4

VARIABLE 

Nombres est un entier
Somme est un entier


TRAITEMENT

ECRIRE"saisissez un nombre"
LIRE Nombres
pour i:=1, de i à Nombres, i++ 
Somme= Somme+i
FIN POUR

ECRIRE" la somme des jusqu'a , Nombres, est Somme

#Exercice 3.5

VARIABLE
Nombres est un entier
Factorielle est un entier

TRAITEMENT
ECRIRE"sasisr un nombre"
LIRE Nombree
POUR i:=1, de i à Nombres, i++
Factorielle*=i
FIN pour

ECRIRE"le factoriel de", Nombres, "est", Factorielle

#Exercice 3.6
VARIABLE
Nombre est un entier
NombreM est un entier
Top est un entier

TRAITEMENT
NombreM=0

POur i:=0, de i à Nombre, i++
ECRIRE"mettez le chiffre" i
LIRE Nombre
SI Nombre>NombreM ALORS NombreM=Nombre, Top=i 
	FIN SI
FIN POUR

ECRIRE "le plus grand nombre est: ", NombreM
ECRIRE NombreM, " étant le nombre numéro: " Top

#Exercice 3.7
VARIABLE
Nombre est un entier
NombreM est une entier
Top est un entier

NombreM=0
Top=0

FAIRE
ECRIRE"SASIRI NOMBRE" ,i++
LIRE Nombre
SI Nombre>NombreM ALORS NombreM=Nombre, Top=Nombre 
	FIN SI
TANT QUE NOMBRE!=0
FIN FAIRE

ECRIRE "le plus grand nombre est: ", NombreM
ECRIRE NombreM, " étant le nombre numéro: " Top


#Exercice 3.8

VARIABLE
Uneuro est un ENTIER
Prix est un DECIMAL
Monaie est un DECIMAL
Billet est un ENTIER
Piece est un DECIMAL


TRAITEMENT

FAIRE
ECRIRE"Sasiri un prix:"
LIRE prix
Monaie= Prix+prix



#Exercice 3.9

VARIABLE
Ordre est un DECIMAL
Desordre est un DECIMAL
Chevaux est un ENTIER
ChevauxJoue est un ENTIER
Calcul est DECIMAL
Celcul est DECIMAL

TRAITEMENT
Calcul =0
Celcul =0
ECRIRE"Saisir le nombre de Cheveaux"
LIRE Cheveaux
ECRIRE"Sasir le nombre cheveaux jouez"
LIRE CheveauxJoue

POUR i=0,de i a Chevaux,i++
calcul*=i
FIN POUR

POUR j=0, de j à Cheveaujoue,i++
Celcul=celcul*i


DESORDRE=




TRAITEMENT


#exercice 4.1



#Exercice 4.2



#Exercice 4.3


#Exercice 4.4

#exrecice 4.5
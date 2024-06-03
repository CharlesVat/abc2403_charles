#evalutation algoritme
 
 VARIABLE
 
 Tableau est un TABLEAU
 ChiffreMax est un ENTIER
 Calcul est un DECIMAL
AuCarre est un ENTIER

TRAITEMENT

POUR i =0, de i a la taille du tableau, i++ FAIRE
Calcul+=Tableau[i]
SI ChiffreMax<Tableau[i] ALORS
ChiffreMax=Tableau[i]
FIN SI
FIN ALORS

Calcul=Calcul/Taille du Tableau
AuCarre=ChiffreMax*ChiffreMax

RESULTAT
ECRIRE"Bienvenu dans le programe de calcul du talbeau d'entier"
ECRIRE"Moyenne des valeurs de tableau: ", Calcul
ECRIRE"la valeur la plus grande(", ChiffreMax, ")élevée au carrée ", AuCarre
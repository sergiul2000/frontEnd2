#Frontend planificator sali evenimente

Aplicatia android contine 3 activitati. Aplicatia este scrisa in kotlin. Activitatea
main, "MainActivity" contine pagina de login. Campurile acestei pagini sunt cele
necesare creeri in spate a unui user pentru a verifica daca acesta exista deja 
in baza de date sau nu. In aceasta pagina putem completa cu datele contului 
existent. Se poate alege rolul contului pentru a verifica daca acestea exista deja 
sau nu. 
AdminActivity contine actiunile specifice adminului. Adica sa aduge o sala noua de
evenimente. 
ClientActivity contine cate un camp in care se poate completa doar numeric cu
nr salii pe care se doreste sa se faca rezervarea si ora la care se doreste sa 
se rezerve. Ora este verificata sa fie de la 0 la 24. Daca campul e gol se cere
comletarea lui. Daca este un nr intre 0 si 24 atunci se afiseaza un pop up msg
in care se confirma rezervarea. 

Navigarea intre activitati este realizata de butonul de login si butoane de back
in activitatile secundare.

Am vrut sa aduc datele din backend cu ajutorul claselor din pachetul API, insa nu am 
am reusit sa le fac sa mearga. Nu am reusit sa aduc cu succes datele din backend
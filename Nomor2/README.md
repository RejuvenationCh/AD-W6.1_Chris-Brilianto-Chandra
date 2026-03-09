<h1> 2. Identify which class method is called, What is the output of the program?, Why are the two lines differenst? </h1>
<img src="/Images/SoalNo2.png" alt="Putput nomor 2">

<a> Class mothod yang dipanggil tergantung dari code mana yang di run, dalam kasus ini ada 2 object yang dipanggl, yang pertama adalah class vehicle dengan Constructor :

    Vehicle v1 = new Vehicle();
    v1.move(); 

</a>
<a> Dan satunya lagi adalah class Vehicle dengan constructor :

   Vehicle v2 = new Car();
   v2.move();

Dua duanya memanggil function move() tapi untk class Vehicle sendiri, dia menmanggil function Move dari public class Vehicle(). Sementara class car() memanggil function move() yang sudah dilakukan @Override sehngga dia akan mengambil block code yang berada dalam function move() yang baru itu. Class vehicle disini jadi parent utamanya dan car cuma menginherit data dari vehicle yang kemudian dia override function dari class vehicle dengan punyanya sendiri.
Car mengoverride print "Vehicle" dengan "Car" 
</a>
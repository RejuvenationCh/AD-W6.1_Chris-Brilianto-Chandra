# AD-W6.1_Chris-Brilianto-Chandra
<h1> 1. What is the output of this program? Explain why. </h1>

<h3> Output Image : </h1> 
<img src="/Images/SoalNo1.png" alt="Output nomor 1"> 

<a> Hasil dari outputnya adalah "Meow", ini dikarenakan pada saat dibuat Child "Cat", ada Annotation @Override, yang membuat dia menggantikan void Sound() sehingga yang diambil priority adalah yang dimiliki oleh cat. Selain itu di dalam Main.java juga tedapat kode :

    System.out.println("Animal and Cat:");
        Animal a = new Cat();
        a.sound();
        System.out.println();

Yang berarti dia memanggil khusus untuk child Cat dan bukan Parentnya, sehingga semua attributes yang terpanggilkan adalah milik cat dan bukan milik parentnya (Animal)

</a>

<h1> 2. Identify which class method is called, What is the output of the program?, Why are the two lines differenst? </h1>
<img src="/Images/SoalNo2.png" alt="Putput nomor 2">

<a> Class mothod yang dipanggil tergantung dari code mana yang di run, dalam kasus ini ada 2 object yang dipanggl, yang pertama adalah class vehicle dengan Constructor :

    Vehicle v1 = new Vehicle();
    v1.move();

Dan satunya lagi adalah class Vehicle dengan constructor :

   Vehicle v2 = new Car();
   v2.move();

Dua duanya memanggil function move() tapi untk class Vehicle sendiri, dia menmanggil function Move dari public class Vehicle(). Sementara class car() memanggil function move() yang sudah dilakukan @Override sehngga dia akan mengambil block code yang berada dalam function move() yang baru itu. Class vehicle disini jadi parent utamanya dan car cuma menginherit data dari vehicle yang kemudian dia override function dari class vehicle dengan punyanya sendiri.
Car mengoverride print "Vehicle" dengan "Car" 
</a>
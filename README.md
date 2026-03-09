# AD-W6.1_Chris-Brilianto-Chandra
1. What is the output of this program? Explain why.
Output Image : 
<img src="/Images/SoalNo1.png" alt="Output nomor 1"> 

Hasil dari outputnya adalah "Meow", ini dikarenakan pada saat dibuat Child "Cat", ada Annotation @Override, yang membuat dia menggantikan void Sound() sehingga yang diambil priority adalah yang dimiliki oleh cat. Selain itu di dalam Main.java juga tedapat kode :
    System.out.println("Animal and Cat:");
        Animal a = new Cat();
        a.sound();
        System.out.println();

yang berarti dia memanggil khusus untuk child Cat dan bukan Parentnya, sehingga semua attributes yang terpanggilkan adalah milik cat dan bukan milik parentnya (Animal)
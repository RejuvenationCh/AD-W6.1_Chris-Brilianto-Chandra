<h1> 3. Distinguish overridden and inherited methods</h1>
<h3> What is the output? Why does one method use the subclass version, but the other uses the superclass version? </h3>

<img src="/Nomor3/SoalNo3.png" alt="Output nomor 3">

<a> 
Jadi disini ada class namanya Employee dengan function Work & attendMeeting dan untuk class Programmer. kHususnya pada class Programmer, dia melakukan Override untuk function work() jadinya dia ketik "Programmer Writes Code"

Kalau dibilang secara output, dia akan keluar 
" Programmer writes code
Employee attends meeting "

Dan ini disebabkan oleh pemanggilan functionnya, karena disini kita gunakan 

   Employee e = new Programmer();

Jadinya kita akan mengambil class dari Programmer yang sudah override bagian work() nya. Dan kemudian kita memanggil function work() dan attendMeeting() sehingga dia keluarnya seperti itu. Salah satunya menggunakan versi subclass karena dari clasnya tidak ada override ataupun pemanggilan lain, jadinya dia pure meng-inherit function awal, sementara satunya dia mengambil superclass karena memanggil function yang sudah dilakukan override
</a>
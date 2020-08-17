package com.example.submissiondicoding

object CapitalCityData {
    private val capitalCityNames = arrayOf("Jakarta",
        "Kuala Lumpur",
        "Singapura",
        "Bandar Seri Begawan",
        "Bangkok",
        "Manila",
        "Hanoi",
        "Naypyidaw",
        "Phnom Penh",
        "Vientiane")

    private val capitalCityDetails = arrayOf("Ibukota Negara Republik Indonesia",
        "Ibukota Negara Malaysia",
        "Ibukota Negara Singapura",
        "Ibukota Negara Brunei Darussalam",
        "Ibukota Negara Thailand",
        "Ibukota Negara Filipina",
        "Ibukota Negara Vietnam",
        "Ibukota Negara Myanmar",
        "Ibukota Negara Kamboja",
        "Ibukota Negara Laos")

    private val capitalCityImages = intArrayOf(R.drawable.jakarta,
        R.drawable.kuala_lumpur,
        R.drawable.singapura,
        R.drawable.bandar_seri_begawan,
        R.drawable.bangkok,
        R.drawable.manilaa,
        R.drawable.hanoi,
        R.drawable.naypyidaww,
        R.drawable.phnom_penh,
        R.drawable.vientiane)

    private val capitalCityDescription = arrayOf("Daerah Khusus Ibukota Jakarta (DKI Jakarta) adalah ibu kota negara dan kota terbesar di Indonesia. Jakarta memiliki luas sekitar 661,52 km² (lautan: 6.977,5 km²), dengan penduduk berjumlah 10.374.235 jiwa (2017). Wilayah metropolitan Jakarta (Jabodetabek) yang berpenduduk sekitar 28 juta jiwa, merupakan metropolitan terbesar di Asia Tenggara atau urutan kedua di dunia.",
        "Kuala Lumpur (sering disingkat KL), atau nama lengkapnya Wilayah Persekutuan Kuala Lumpur, adalah ibu kota dan kota terbesar di Malaysia. Kawasan Wilayah Persekutuan meliputi wilayah seluas 244 km² (94 mil²), diperkirakan dihuni oleh sekitar 1,6 juta penduduk pada tahun 2006. Kuala Lumpur Raya, juga dikenal sebagai Lembah Kelang, memiliki jumlah penduduk sebesar 7,2 juta jiwa. Kuala Lumpur merupakan wilayah metropolitan dengan pertumbuhan paling pesat di Malaysia, baik dalam jumlah penduduk maupun ekonomi.",
        "Singapura (nama resmi: Republik Singapura) adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan. Singapura adalah pusat keuangan terdepan ketiga di dunia dan sebuah kota dunia kosmopolitan yang memainkan peran penting dalam perdagangan dan keuangan internasional. Pelabuhan Singapura adalah satu dari lima pelabuhan tersibuk di dunia.",
        "Bandar Seri Begawan, populasinya diperkirakan 46.229 jiwa (1991), adalah ibu kota kesultanan Brunei Darussalam. Kota ini merupakan produsen mebel, tekstil, kerajinan tangan, dan kayu. Di sinilah tempat Balai Upacara Kerajaan, Bangunan Tanda Kebesaran Kerajaan dan Pusat Sejarah Brunei. Kota ini juga unik karena memiliki sebuah desa dekat air, Kampung Ayer yang memiliki rumah di atas jangkungan dan terbentang sampai ke laut sejauh 500 m. Bagian pertama namanya Bandar berasal dari Bahasa Persia بندر dan berarti 'pelabuhan' atau 'tempat tinggal'.",
        "Bangkok adalah ibu kota negara Thailand. Kota ini terletak di tepi barat Sungai Chao Phraya, dekat Teluk Thailand. Bangkok adalah salah satu kota dengan perkembangan terpesat, dengan ekonomi yang dinamis dan kemasyarakatan yang progresif di Asia Tenggara. Kota ini sedang berkembang menjadi pusat regional yang dapat menyaingi Singapura dan Hong Kong, namun masih mempunyai masalah dalam sektor infrastruktur dan sosial sebagai akibat perkembangannya yang pesat. Bangkok telah lama menjadi pintu masuk bagi penanam modal asing yang ingin mencari pasar baru di Asia.",
        "Manila (Maynila dalam bahasa Filipino) adalah ibu kota dari Filipina. Kota ini terletak di tepi timur Teluk Manila di pulau terbesar dan terutara Filipina, Luzon. Meskipun ada beberapa tempat kemiskinan, kota ini merupakan salah satu kota kosmopolitan dunia dan daerah metropolitannya merupakan pusat ekonomi, budaya, pendidikan dan industri negara ini. Manila sering disebut Mutiara Orient. Manila adalah daerah metropolitan dengan penduduk lebih dari 10 juta jiwa. Metropolis ini disebut Metro Manila, tetapi sering hanya disebut Manila oleh orang asing dan selain penduduk sana, terdiri dari 17 kota dan munisipal. Artikel ini membahas kotanya; lihat Metro Manila untuk artikel tentang daerah metropolisnya.",
        "Hanoi (Bahasa Vietnam: Hà Nội; Chữ Nôm: 河内), perkiraan populasi 3.500.800 jiwa (1997), adalah ibu kota Vietnam dan dulunya ibu kota Vietnam Utara dari 1954 hingga 1976. Kota ini terletak di tepi kanan Sungai Merah. Industri yang dihasilkan Vietnam ialah peralatan mesin, kayu lapis, tekstil, kimia, dan rajutan tangan. Hanoi menjadi ibu kota Vietnam pada abad ke-7. Namanya yang berasal dari bahasa Mandarin, Đông Kinh, menjadi Tonkin dan dipakai bangsa Eropa ke seluruh wilayah Vietnam. Hanoi dijajah Prancis tahun 1873 dan diserahkan kepadanya sepuluh tahun kemudian. Ia menjadi ibu kota Indochina Prancis setelah 1887.",
        "Naypyidaw adalah bacaan untuk Nay Pyi Taw, adalah ibu kota nasional Myanmar yang sekarang, berlokasi di Desa Kyatpyae, Kota Pyinmana, Provinsi Mandalay. Kyatpyae dalam bahasa Myanmar berarti 'lari di bawah perjuangan'. Naypyitaw berarti 'Kota/Istana Kerajaan', tetapi juga diartikan sebagai 'singgasana raja'. Kegiatan administrasi ibu kota Myanmar secara resmi dipindahkan ke sebuah lahan kosong sekitar dua mil barat Pyinmana pada 6 November 2005. Naypyitaw kurang lebih 320 kilometer di sebelah utara Yangon. Nama resmi ibu kota diumumkan pada saat Hari Angkatan Militer (Armed Forces Day) pada Maret 2006.",
        "Phnom Penh adalah kota terbesar di Kamboja. Kota ini memiliki penduduk sekitar 1 juta jiwa, sementara seluruh penduduk Kamboja adalah 11,4 juta jiwa. Phnom Penh adalah ibu kota terbesar negara Kamboja. Terletak di tepi Sungai Mekong, Phnom Penh telah menjadi ibu kota negara sejak Kamboja dijajah Prancis. Phnom Penh telah berkembang menjadi pusat negara dan pusat industri kegiatan perekonomian, serta pusat keamanan, politik, ekonomi, warisan budaya dan pemerintahan Kamboja.",
        "Vientiane adalah ibu kota Laos yang terletak di Lembah Mekong. Vientiane merupakan bagian dari prefektur Vientiane (kampheng nakhon Vientiane) dan terletak di perbatasan dengan Thailand. Penduduknya pada tahun 2005 diperkirakan berjumlah 723.000 jiwa. Vientiane terletak pada 17°58' LU, 102°36' BT (17.9667, 102.6).")

    //Mengambil data dari Array diatas dan menyimpannya dalam variabel listData
    val listData: ArrayList<CapitalCity> //Menyimpan nilai dalam bentuk Array
    get() {
        val list = arrayListOf<CapitalCity>()
        for (position in capitalCityNames.indices) {
            val capitalCity = CapitalCity() //CapitalCity adalah nama kelas dimana terdapat beberapa variabel yang akan diisi nilai/data di bagian ini
            capitalCity.nama        = capitalCityNames[position]
            capitalCity.detail      = capitalCityDetails[position]
            capitalCity.foto        = capitalCityImages[position]
            capitalCity.deskripsi   = capitalCityDescription[position]
            list.add(capitalCity)
        }
        return list //Mengembalikan nilai list
    }
}
package com.berkedursunoglu.thirdassingment.models

import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.berkedursunoglu.thirdassingment.R
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookModel(
    val id: Int,
    val bookName: String,
    val bookAuthor: String,
    val bookSummary: String,
    val bookPageSize: String,
    val bookType: String,
    val bookRarity: String,
    val bookCost: String,
    val bookPrice:Double,
    val drawable:Int
) :
    Parcelable {

    fun toJson():String{
        return Gson().toJson(this)
    }

    companion object {
        fun fromJson(str:String): BookModel{
            return Gson().fromJson(str, BookModel::class.java)
        }
    }
}

val bookArrayList = mutableListOf<BookModel> (
    BookModel(1,
        "Suç ve Ceza",
        "Dostoyevski",
        "Rodya Romanoviç Raskolnikov yoksul bir gençtir; Petesburg Üniversitesi'ndeki hukuk öğrenimini yarıda bırakır. Aklı Batı'dan gelen siyasi ve felsefi düşüncelerle karmakarışıktır. Nefret edilen, kötü bir tefeciyi öldürecektir. Böylece finansal problemlerini çözerken aynı zamanda dünya kötü, değersiz bir parazitten temizlenecektir. Raskolnikov, daha yüksek bir amaca hizmet eden bir cinayetin kabul edilebilir olduğuna inanır. Bir sürü hesap kitaptan sonra harekete geçer ve kadının evine giderek onu baltayla vahşice öldürür. O anda, Alonya ile birlikte yaşayan ve kimseye bir zararı dokunmayan üvey kız kardeşi beklenmedik biçimde içeri girdiğinden, Raskolnikov onu da öldürmek zorunda kalır. Müşterilerin rehin için bıraktıkları birkaç küçük süs eşyasını alır ve kimseye görünmeden oradan ayrılır. Kimsenin kendisini görmediğini bildiği halde, Raskolnikov son derecede tedirgindir. Tedirginliği ailesi ve yakın çevresini de etkilenir. Raskolnikov'un hayatında üç kadın vardır. Bunlardan ilki olan annesi, düşkün ve müşfik bir kadındır. Hayatındaki ikinci kadın, kız kardeşi Dounia'dır. Hayatındaki üçüncü kadın ise Marmeladov adındaki işsiz kâtibin kızı Sonia'dır. Raskolnikov onunla ara sıra buluşmuş, arkadaşlık etmiştir. Sonia'nın ailesi, babasının ayyaşlığı yüzünden çok yoksuldur. Sonia, ailesine bakmak için fahişelik yapmaya başlamıştır.",
        "687",
        "Roman",
        "Dünya Klasiği",
        "39.90₺",39.90, R.drawable.sucveceza),
    BookModel(2,
        "Bir İdam Mahkumunun Son Günü",
        "Victor Hugo",
        "Cinayetten yargılanan mahkum, duruşmasının ardından ölüm cezasına çarptırılır. Mahkeme, bu tutukluya beş hafta sonra idam cezası verdi. Her şeyden önce, hala affedileceği ümidine sahiptir ve bu süre zarfında af çıkarılması veya ölüm cezasının hapse çevrilmesi ihtimaliyle dikkatini dağıtır. Mahkum, idam cezasından sonra tam beş hafta boyunca sürekli olarak ölümü düşünür. Ölümden önce idam edilme ve ölme düşüncesi onu öldürmeye başlamıştır. Tüm ruhu daralmış, tüm ruhu ölüm düşüncesine saplanmıştır. Ölme korkusu egosunun her noktasına nüfuz ederek. Yaşadığı her saniye ölümüyle ilgili ayrıntıları kurguluyor. Ölümünü bekleyen mahkum, ruhunda birçok değişikliğe uğrar, hayata ve insanlığa karşı tüm hisleri de değişir.",
        "132",
        "Roman",
        "Dünya Klasiği",
        "12.99₺",
        12.99,R.drawable.biridamahkumununsongunu),
    BookModel(3,
        "Fareler ve İnsanlar",
        "John Steinbeck",
        "1920'lerde kendisi de evsiz gezici bir çiflik işçisi olan Steinbeck'in kendi deneyimlerine dayanan novellasının başlığı, Robert Burns'ün To a Mouse (Bir Fareye) isimli şiirinden alınmıştır. Scots dilinde yazılan şiirin sıkça alıntılanan iki dizesi şöyledir: \"The best laid schemes o' mice an' men/Gang aft agley (En iyi planları farelerin ve insanların/Sıkça ters gider\").",
        "111",
        "Roman",
        "Dünya Klasiği",
        "49.99₺",49.99,R.drawable.farelerveinsanlar),
    BookModel(4,
        "Suç ve Ceza",
        "Dostoyevski",
        "Rodya Romanoviç Raskolnikov yoksul bir gençtir; Petesburg Üniversitesi'ndeki hukuk öğrenimini yarıda bırakır. Aklı Batı'dan gelen siyasi ve felsefi düşüncelerle karmakarışıktır. Nefret edilen, kötü bir tefeciyi öldürecektir. Böylece finansal problemlerini çözerken aynı zamanda dünya kötü, değersiz bir parazitten temizlenecektir. Raskolnikov, daha yüksek bir amaca hizmet eden bir cinayetin kabul edilebilir olduğuna inanır. Bir sürü hesap kitaptan sonra harekete geçer ve kadının evine giderek onu baltayla vahşice öldürür. O anda, Alonya ile birlikte yaşayan ve kimseye bir zararı dokunmayan üvey kız kardeşi beklenmedik biçimde içeri girdiğinden, Raskolnikov onu da öldürmek zorunda kalır. Müşterilerin rehin için bıraktıkları birkaç küçük süs eşyasını alır ve kimseye görünmeden oradan ayrılır. Kimsenin kendisini görmediğini bildiği halde, Raskolnikov son derecede tedirgindir. Tedirginliği ailesi ve yakın çevresini de etkilenir. Raskolnikov'un hayatında üç kadın vardır. Bunlardan ilki olan annesi, düşkün ve müşfik bir kadındır. Hayatındaki ikinci kadın, kız kardeşi Dounia'dır. Hayatındaki üçüncü kadın ise Marmeladov adındaki işsiz kâtibin kızı Sonia'dır. Raskolnikov onunla ara sıra buluşmuş, arkadaşlık etmiştir. Sonia'nın ailesi, babasının ayyaşlığı yüzünden çok yoksuldur. Sonia, ailesine bakmak için fahişelik yapmaya başlamıştır.",
        "687",
        "Roman",
        "Dünya Klasiği",
        "39.90₺",39.90, R.drawable.sucveceza),
    BookModel(5,
        "Bir İdam Mahkumunun Son Günü",
        "Victor Hugo",
        "Cinayetten yargılanan mahkum, duruşmasının ardından ölüm cezasına çarptırılır. Mahkeme, bu tutukluya beş hafta sonra idam cezası verdi. Her şeyden önce, hala affedileceği ümidine sahiptir ve bu süre zarfında af çıkarılması veya ölüm cezasının hapse çevrilmesi ihtimaliyle dikkatini dağıtır. Mahkum, idam cezasından sonra tam beş hafta boyunca sürekli olarak ölümü düşünür. Ölümden önce idam edilme ve ölme düşüncesi onu öldürmeye başlamıştır. Tüm ruhu daralmış, tüm ruhu ölüm düşüncesine saplanmıştır. Ölme korkusu egosunun her noktasına nüfuz ederek. Yaşadığı her saniye ölümüyle ilgili ayrıntıları kurguluyor. Ölümünü bekleyen mahkum, ruhunda birçok değişikliğe uğrar, hayata ve insanlığa karşı tüm hisleri de değişir.",
        "132",
        "Roman",
        "Dünya Klasiği",
        "12.99₺",
        12.99,R.drawable.biridamahkumununsongunu),
    BookModel(6,
        "Fareler ve İnsanlar",
        "John Steinbeck",
        "1920'lerde kendisi de evsiz gezici bir çiflik işçisi olan Steinbeck'in kendi deneyimlerine dayanan novellasının başlığı, Robert Burns'ün To a Mouse (Bir Fareye) isimli şiirinden alınmıştır. Scots dilinde yazılan şiirin sıkça alıntılanan iki dizesi şöyledir: \"The best laid schemes o' mice an' men/Gang aft agley (En iyi planları farelerin ve insanların/Sıkça ters gider\").",
        "111",
        "Roman",
        "Dünya Klasiği",
        "49.99₺",49.99,R.drawable.farelerveinsanlar),
    BookModel(7,
        "Suç ve Ceza",
        "Dostoyevski",
        "Rodya Romanoviç Raskolnikov yoksul bir gençtir; Petesburg Üniversitesi'ndeki hukuk öğrenimini yarıda bırakır. Aklı Batı'dan gelen siyasi ve felsefi düşüncelerle karmakarışıktır. Nefret edilen, kötü bir tefeciyi öldürecektir. Böylece finansal problemlerini çözerken aynı zamanda dünya kötü, değersiz bir parazitten temizlenecektir. Raskolnikov, daha yüksek bir amaca hizmet eden bir cinayetin kabul edilebilir olduğuna inanır. Bir sürü hesap kitaptan sonra harekete geçer ve kadının evine giderek onu baltayla vahşice öldürür. O anda, Alonya ile birlikte yaşayan ve kimseye bir zararı dokunmayan üvey kız kardeşi beklenmedik biçimde içeri girdiğinden, Raskolnikov onu da öldürmek zorunda kalır. Müşterilerin rehin için bıraktıkları birkaç küçük süs eşyasını alır ve kimseye görünmeden oradan ayrılır. Kimsenin kendisini görmediğini bildiği halde, Raskolnikov son derecede tedirgindir. Tedirginliği ailesi ve yakın çevresini de etkilenir. Raskolnikov'un hayatında üç kadın vardır. Bunlardan ilki olan annesi, düşkün ve müşfik bir kadındır. Hayatındaki ikinci kadın, kız kardeşi Dounia'dır. Hayatındaki üçüncü kadın ise Marmeladov adındaki işsiz kâtibin kızı Sonia'dır. Raskolnikov onunla ara sıra buluşmuş, arkadaşlık etmiştir. Sonia'nın ailesi, babasının ayyaşlığı yüzünden çok yoksuldur. Sonia, ailesine bakmak için fahişelik yapmaya başlamıştır.",
        "687",
        "Roman",
        "Dünya Klasiği",
        "39.90₺",39.90, R.drawable.sucveceza),
    BookModel(8,
        "Bir İdam Mahkumunun Son Günü",
        "Victor Hugo",
        "Cinayetten yargılanan mahkum, duruşmasının ardından ölüm cezasına çarptırılır. Mahkeme, bu tutukluya beş hafta sonra idam cezası verdi. Her şeyden önce, hala affedileceği ümidine sahiptir ve bu süre zarfında af çıkarılması veya ölüm cezasının hapse çevrilmesi ihtimaliyle dikkatini dağıtır. Mahkum, idam cezasından sonra tam beş hafta boyunca sürekli olarak ölümü düşünür. Ölümden önce idam edilme ve ölme düşüncesi onu öldürmeye başlamıştır. Tüm ruhu daralmış, tüm ruhu ölüm düşüncesine saplanmıştır. Ölme korkusu egosunun her noktasına nüfuz ederek. Yaşadığı her saniye ölümüyle ilgili ayrıntıları kurguluyor. Ölümünü bekleyen mahkum, ruhunda birçok değişikliğe uğrar, hayata ve insanlığa karşı tüm hisleri de değişir.",
        "132",
        "Roman",
        "Dünya Klasiği",
        "12.99₺",
        12.99,R.drawable.biridamahkumununsongunu),
    BookModel(9,
        "Fareler ve İnsanlar",
        "John Steinbeck",
        "1920'lerde kendisi de evsiz gezici bir çiflik işçisi olan Steinbeck'in kendi deneyimlerine dayanan novellasının başlığı, Robert Burns'ün To a Mouse (Bir Fareye) isimli şiirinden alınmıştır. Scots dilinde yazılan şiirin sıkça alıntılanan iki dizesi şöyledir: \"The best laid schemes o' mice an' men/Gang aft agley (En iyi planları farelerin ve insanların/Sıkça ters gider\").",
        "111",
        "Roman",
        "Dünya Klasiği",
        "49.99₺",49.99,R.drawable.farelerveinsanlar)

)
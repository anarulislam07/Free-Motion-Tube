
package com.anarul.freemotiontube;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();


		//========================Sampol==================================================
		//addVideoItem("", "", "");

		//createPlayList("Sylhet Flood", R.drawable.flood);
		//==========================================================================






		//===============================Sylhet Flood===========================================
		addVideoItem("lbKwB-Rtm3Y", " কুলসুমাদের ভেজা কাপড় শুকাবে কবে ?", "Free Motion");
		addVideoItem("wGgwELJ5OMw", "নিজ ঘরে ঠাঁই হবে কবে ?", "Free Motion");
		addVideoItem("Nusu2uyjisM", "আশ্রয় কেন্দ্রেও অনিশ্চিত জীবন।", "Free Motion");
		addVideoItem("fLNHRhltAZY", "জীবনের প্রথম কোরবানী।।", "Free Motion");
		addVideoItem("wdZLCy619t0", "মায়াবী দৃষ্টি দেখলে মনে হয় এই বাচ্চাগুলোর উপর পুরো সংসারের দায়িত্ব।", "We Are Human");
		addVideoItem("DRawNvMfzlA", "সিলেটবাসীর কান্না।", "We Are Human");
		addVideoItem("BvyrLAqIYH0", "নিজের জীবনের মায়া ত্যাগ করে সিলেটবাসীর পাশে থাকার প্রতিদান আলহামদুলিল্লাহ।", "We Are Human");
		addVideoItem("wT6cnhmsh4o", "সিলেটে ডাকাতি হওয়ার গল্প।", "We Are Human");
		addVideoItem("8Pbq3uMkEo", "সবার মুখে একটাই কথা খাবার পাচ্ছি না,তাহলে কোটি টাকার খাবার যাচ্ছে কোথায়??", "We Are Human");
		addVideoItem("aOtcNX8pwhU", "সিলেট -সুনামগঞ্জের যোগাযোগ বিচ্ছিন্ন বহুদিন যাবত ।", "We Are Human");
		addVideoItem("SN8RlqrUGi4", "পুরুষ মানুষ সহজে কাঁদে না,তবে বন্যার পানি কাঁদিয়ে দিল।", "We Are Human");
		addVideoItem("Bgccd_hhoNg", "চুলা ভরা পানি ভাত খেতে ইচ্ছে করে কিন্তু চালগুলো নষ্ট হয়ে গেছে।", "We Are Human");
		addVideoItem("IzsFmmRqS04", "বন্যা প্লাবিত এলাকায় মেয়েদের বিশেষ প্রয়োজন স্যানেটারি ন্যাপকিন", "We Are Human");
		addVideoItem("yeRjAcRvtRg", "সিলেটের বন্যা বুঝিয়ে দিলো আমাদের কোটি টাকা মূল্যহীন।", "We Are Human");
		addVideoItem("S6WDyoFiJSY", "আমার চোখের সামনে নৌকাটা ডুবে গেলো।", "We Are Human");

		createPlayList("Motion Tube", R.drawable.motio);
		//==========================================================================



		//========================Sampol==================================================
		addVideoItem("eSeTF5ym1hg", "New Comedy Video Amazing Funny Video", "Episode 01");
		addVideoItem("KiAId15Uo9A", "New Comedy Video Amazing Funny Video", "Episode 02");
		addVideoItem("NiZd6sbC7BI", "New Comedy Video Amazing Funny Video", "Episode 03");
		addVideoItem("7g-MtbqrfBI", "New Comedy Video Amazing Funny Video", "Episode 04");
		addVideoItem("X50df6Cptd8", "New Comedy Video Amazing Funny Video", "Episode 05");
		addVideoItem("4UvBYXyQRPY", "New Comedy Video Amazing Funny Video", "Episode 06");
		addVideoItem("4vb0jfrMB0U", "New Comedy Video Amazing Funny Video", "Episode 07");
		addVideoItem("OBpyHqQNoPM", "New Comedy Video Amazing Funny Video", "Episode 08");
		addVideoItem("Al7J434_mqE", "New Comedy Video Amazing Funny Video", "Episode 09");
		addVideoItem("kjyI19B8A18", "New Comedy Video Amazing Funny Video", "Episode 10");
		addVideoItem("9pyCQS8VslE", "New Comedy Video Amazing Funny Video", "Episode 11");
		addVideoItem("qdlBRRSanPY", "New Comedy Video Amazing Funny Video", "Episode 12");
		addVideoItem("V2E5psPIIA8", "New Comedy Video Amazing Funny Video", "Episode 13");
		addVideoItem("Tu2Fsm32LY0", "New Comedy Video Amazing Funny Video", "Episode 14");
		addVideoItem("YgZvsQsyZWc", "New Comedy Video Amazing Funny Video", "Episode 15");
		addVideoItem("kaagArqBZPg", "New Comedy Video Amazing Funny Video", "Episode 16");
		addVideoItem("c05lSwNWFFc", "New Comedy Video Amazing Funny Video", "Episode 17");
		addVideoItem("GATOzyDwEHA", "New Comedy Video Amazing Funny Video", "Episode 18");
		addVideoItem("sHWurNuA4dM", "New Comedy Video Amazing Funny Video", "Episode 19");
		addVideoItem("lGgHyqC-yXc", "New Comedy Video Amazing Funny Video", "Episode 20");
		addVideoItem("Ie8Kqw2EaBQ", "New Comedy Video Amazing Funny Video", "Episode 21");
		addVideoItem("Xqe7Jf8J5Dw", "New Comedy Video Amazing Funny Video", "Episode 22");
		addVideoItem("fgmgqe9_1II", "New Comedy Video Amazing Funny Video", "Episode 23");
		addVideoItem("MptjmhEVvf0", "New Comedy Video Amazing Funny Video", "Episode 24");
		addVideoItem("CnZlEZgoC3g", "New Comedy Video Amazing Funny Video", "Episode 25");
		addVideoItem("lDYrHEE52Js", "New Comedy Video Amazing Funny Video", "Episode 26");
		addVideoItem("IGtTazwmd0c", "New Comedy Video Amazing Funny Video", "Episode 27");
		addVideoItem("soK-K-n_n0k", "New Comedy Video Amazing Funny Video", "Episode 28");
		addVideoItem("NQF4j_CJDYU", "New Comedy Video Amazing Funny Video", "Episode 29");
		addVideoItem("AyVh1cJSL6w", "New Comedy Video Amazing Funny Video", "Episode 30");
		addVideoItem("xGMoYktv9Y0", "New Comedy Video Amazing Funny Video", "Episode 31");
		addVideoItem("yZGfpRiLHPc", "New Comedy Video Amazing Funny Video", "Episode 32");
		addVideoItem("tN8Ybtb0VE0", "New Comedy Video Amazing Funny Video", "Episode 33");

		addVideoItem("3vdKxnNefYA", "New Comedy Video Amazing Funny Video", "Episode 34");
		addVideoItem("aDRseYztUck", "New Comedy Video Amazing Funny Video", "Episode 35");
		addVideoItem("UQ2RGRUghHM", "New Comedy Video Amazing Funny Video", "Episode 36");
		addVideoItem("sLrdU9wouMw", "New Comedy Video Amazing Funny Video", "Episode 37");
		addVideoItem("U0LJ1vbjzoU", "New Comedy Video Amazing Funny Video", "Episode 38");

		addVideoItem("9S-YGXlRO-Y", "New Comedy Video Amazing Funny Video", "Episode 39");
		addVideoItem("vSEW78ECOP4", "New Comedy Video Amazing Funny Video", "Episode 40");
		addVideoItem("rhpoVVEjR-0", "New Comedy Video Amazing Funny Video", "Episode 41");
		addVideoItem("p5E5a9wJdt8", "New Comedy Video Amazing Funny Video", "Episode 42");
		addVideoItem("YayLrWGBczg", "New Comedy Video Amazing Funny Video", "Episode 43");

		addVideoItem("Qqd1_myfwY", "New Comedy Video Amazing Funny Video", "Episode 44");
		addVideoItem("XNI5ClVmqg0", "New Comedy Video Amazing Funny Video", "Episode 45");
		addVideoItem("TToxlGsc-qc", "New Comedy Video Amazing Funny Video", "Episode 46");
		addVideoItem("VhepGCBQt68", "New Comedy Video Amazing Funny Video", "Episode 47");
		addVideoItem("aiuKM_Uavfo", "New Comedy Video Amazing Funny Video", "Episode 48");

		addVideoItem("oh89lZ05VT0", "New Comedy Video Amazing Funny Video", "Episode 49");
		addVideoItem("AIQWjD941TE", "New Comedy Video Amazing Funny Video", "Episode 50");
		addVideoItem("vYOx-NcvweE", "New Comedy Video Amazing Funny Video", "Episode 51");
		addVideoItem("CpWVZt4GauE", "New Comedy Video Amazing Funny Video", "Episode 52");
		addVideoItem("LQyYz_J7RY", "New Comedy Video Amazing Funny Video", "Episode 53");


		createPlayList("Funny Video", R.drawable.funny_icon);
		//==========================================================================


		//=====================Support Humanity=====================================================
		addVideoItem("KGsiLmF2ngw", "ভেজাল জিনিষের ভিড়ে এরা বিক্রি করে ভালোবাসা", "Support Humanity");
		addVideoItem("GbEJre_OoNY", "ব্যবসা করা সুন্নত", "Support Humanity");
		addVideoItem("wazhBPQsu9Q", "কী অদ্ভুত জীবন", "Support Humanity");
		addVideoItem("2kKUDYwl78A", "আমার জন্য কিছু খাবার নিয়ে আসো, দেখি কে কি আনো ?", "Free Motion");
		addVideoItem("uV89pv5Y3i0", "আমার জন্য না, আমার মায়ের জন্য লাগবে।", "Free Motion");
		addVideoItem("qlVDJZoMJB0", "আলহামদুলিল্লাহ্! নানি-নাত্নির জীবনে নতুন মোড় Part-02", "Free Motion");
		addVideoItem("zCcxBuBtess", "আলহামদুলিল্লাহ্! নানি-নাত্নির জীবনে নতুন মোড় Part-02", "Free Motion");
		addVideoItem("ebwPunvDuYo", "ছোটবেলার এমন বিপদের কথা প্রায়ই মনে পড়ে।", "Free Motion");
		addVideoItem("UeZuP5-EY0I", "বিয়ের অনুষ্ঠানে আমরা যা অপচয় করি, তা দিয়েই এদের ফ্রেশ খাবারের ব্যবস্থা হয়ে যেতো।", "Free Motion");
		addVideoItem("rBllRbftxBs", "তাঁর দেওয়া উদাহরণ গুলা ছিলো শুনার মত।", "Free Motion");
		addVideoItem("k7WpxiexSlA", "ভেজাল জিনিষের ভিড়ে এরা বিক্রি করে ভালোবাসা ", "Support Humanity");
		addVideoItem("OtuX82CKlL8", "ক্ষুধার্তেদের মুখে খাবার দিতে পারা সৌভাগ্যের", "Support Humanity");
		addVideoItem("lbKwB-Rtm3Y", " কুলসুমাদের ভেজা কাপড় শুকাবে কবে ?", "Free Motion");
		addVideoItem("JDvRhcM50T0", "সবার ঈদে পূর্ণতা আসুক।", "Free Motion");
		addVideoItem("f7UOrrwHwC8", "ব্যবসা করা সুন্নত।", "Free Motion");
		addVideoItem("D2mLhKuWQT4", "চারদিকে এতো এতো ভেজাল জিনিষের ভিড়ে এরা বিক্রি করে ভালোবাসা", "Free Motion");
		addVideoItem("vfe7Xx4aJyE", "ময়লাওয়ালা নয়, এরা পরিচ্ছন্ন কর্মী।", "Free Motion");
		addVideoItem("Wmm6jCte8CY", "হাসির মুখের হাসি", "Free Motion");
		addVideoItem("4K5DHBtJTog", "মায়াবতী জেসমিন। Part 01", "Free Motion");
		addVideoItem("NXEjpnWMrMY", "মায়াবতী জেসমিন। Part 01", "Free Motion");

		createPlayList("অসহায় শিশু", R.drawable.children);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("JthDApUO_Oo", "Unmilited Funny Video, New Comedy Video", "Episode 01");
		addVideoItem("GLldDKSrp9M", "Unmilited Funny Video, New Comedy Video", "Episode 02");
		addVideoItem("udd8Zjj2zRk", "Unmilited Funny Video, New Comedy Video", "Episode 03");
		addVideoItem("vxM2_HmhcJU", "Unmilited Funny Video, New Comedy Video", "Episode 04");
		addVideoItem("BChPa3vIuRI", "Unmilited Funny Video, New Comedy Video", "Episode 05");

		addVideoItem("P1hk9eEJ4h4", "Unmilited Funny Video, New Comedy Video", "Episode 06");
		addVideoItem("OPLFtZxuYIM", "Unmilited Funny Video, New Comedy Video", "Episode 07");
		addVideoItem("8vX-2SAreR4", "Unmilited Funny Video, New Comedy Video", "Episode 08");
		addVideoItem("4TeDIpbeHgE", "Unmilited Funny Video, New Comedy Video", "Episode 09");
		addVideoItem("mj2sv6S86B4", "Unmilited Funny Video, New Comedy Video", "Episode 10");
		addVideoItem("NQF4j_CJDYU", "Unmilited Funny Video, New Comedy Video", "Episode 11");

		addVideoItem("AyVh1cJSL6w", "Unmilited Funny Video, New Comedy Video", "Episode 12");
		addVideoItem("3PcUngR7erg", "Unmilited Funny Video, New Comedy Video", "Episode 13");
		addVideoItem("3i0-D18rXLA", "Unmilited Funny Video, New Comedy Video", "Episode 14");
		addVideoItem("qzA35tRlAro", "Unmilited Funny Video, New Comedy Video", "Episode 15");
		addVideoItem("_xscOWSJbAI", "Unmilited Funny Video, New Comedy Video", "Episode 16");
		addVideoItem("EmJNhaHUJx0", "Unmilited Funny Video, New Comedy Video", "Episode 17");
		addVideoItem("D1d7-6z2-0k", "Unmilited Funny Video, New Comedy Video", "Episode 18");

		addVideoItem("WtV4yGZ_g8M", "Unmilited Funny Video, New Comedy Video", "Episode 19");
		addVideoItem("RvCz_zlkhA8", "Unmilited Funny Video, New Comedy Video", "Episode 20");
		addVideoItem("mr_oyw9NQVQ", "Unmilited Funny Video, New Comedy Video", "Episode 21");
		addVideoItem("GtDoTGq2P1s", "Unmilited Funny Video, New Comedy Video", "Episode 22");
		addVideoItem("RfcoG_lyXjk", "Unmilited Funny Video, New Comedy Video", "Episode 23");

		addVideoItem("rB11d4adONM", "Unmilited Funny Video, New Comedy Video", "Episode 24");
		addVideoItem("EXblG4Tfpgc", "Unmilited Funny Video, New Comedy Video", "Episode 25");
		addVideoItem("JIJ6f_-Tu2A", "Unmilited Funny Video, New Comedy Video", "Episode 26");
		addVideoItem("M5HsGSFrOSE", "Unmilited Funny Video, New Comedy Video", "Episode 27");
		addVideoItem("H8ckv9sGSd4", "Unmilited Funny Video, New Comedy Video", "Episode 28");

		addVideoItem("OmSY86XKZnQ", "Unmilited Funny Video, New Comedy Video", "Episode 29");
		addVideoItem("wBfjHtfYdzY", "Unmilited Funny Video, New Comedy Video", "Episode 30");
		addVideoItem("xaTi_ZgGf_c", "Unmilited Funny Video, New Comedy Video", "Episode 31");
		addVideoItem("nVY8iuc73LQ", "Unmilited Funny Video, New Comedy Video", "Episode 32");



		createPlayList("Unlimited Fun ", R.drawable.funny_cat);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("98aUluPxRi0", "জীবন সংগ্রাম কখনই বয়সের দিক বিবেচনা করে আসে না ।", "Free Motion");
		addVideoItem("n28VLZJQK9w", "জীবিকা অন্বেষনই এদের নিত্যদিনের চ্যালেঞ্জ।", "Free Motion");
		addVideoItem("g0ijxqmL_Qw", "মাহে রমজানের ঘ্রাণ আসছে ", "Support Humanity");
		addVideoItem("tjPHHR_mNtw", "হয়তো কাজে ফিরবে, নয়তো হাসিটা থাকবে কিছুদিন।", "Free Motion");
		addVideoItem("k7WpxiexSlA", "চারদিকে এতো এতো ভেজাল জিনিষের ভিড়ে এরা বিক্রি করে ভালোবাসা |", "Support Humanity");
		addVideoItem("SUzFIn2VDK8", "প্রত্যেকের হাসির মাঝে যেন মুক্তা ঝরে", "Support Humanity");
		addVideoItem("HNsjkfYMYuw", "হাহাকার এই পরিস্থিতি, অসহায়ত্বের বহিঃপ্রকাশ।", "Free Motion");
		addVideoItem("zK3_lEaY1Fs", "হাওয়াই মিঠাই।", "Fre Motion");
		addVideoItem("qu6MkQRkazY", "যে শহরে মানুষ ১০টাকার ছাড়া দেয় না।", "We Are Human");
		addVideoItem("LXzonzw6xiI", "হঠাৎ সারপ্রাইজ গুলো কিছুটা হলেও থমকে দেয়।", "We Are Human");
		addVideoItem("evXnozEFoR4", "রমজান মাসে সবার মাঝে ছড়িয়ে পড়ুক ভালোবাসা।", "We Are Human");
		addVideoItem("6DfVwr7GENY", "বয়স ১২০বছর,এখনও করেন ভিক্ষা ভালো খাবারের অভাবে রোজা রাখতে পারেন না।", "We Are Human");
		addVideoItem("1FheqiR15rs", "গ্রামের সুন্দর পরিবেশে ইফতারের আয়োজন করলাম আলহামদুলিল্লাহ।", "We Are Human");
		addVideoItem("aZL2w6H4D7E", "প্রতিটা মানুষ সামর্থের মধ্যে সীমাবদ্ধ কী?", "We Are Human");
		addVideoItem("ClQBhfWL0ms", "ঈদের দিন শাড়ি নিয়ে এসো,কথা শুনে মনে হলো আমি কত আপন তার।", "We Are Human");
		addVideoItem("9lKI-xtJ5eQ", "পন্য কিনে লস হতে পারে, তবে সদকায়ে কখনো লস হয় না।", "Free Motion");
		addVideoItem("Otp3YhZQqtA", "না দেখার ভান করলে মূলত ইজ্জত রক্ষা হবে না।", "Free Motion");
		addVideoItem("NSp2gqn1URk", "ভাগ্য এবং পরিস্থিতি কাউকে ধনী বানায়, আবার কাউকে রাখে বঞ্ছিত।", "Free Motion");
		addVideoItem("22JQOcgg_tE", "এই ঈদে খানিকটা খুশি ছড়িয়ে দিলো idea Fashion", "Free Motion");
		addVideoItem("wYanfvQ0JU8", "আমরা প্রায়ই এদেরকে ক্ষুধার্ত রেখে হুর হুর করে তাড়িয়ে দেই।", "Free Motion");
		addVideoItem("_o86mzUx47g", "লক্ষ্য কোটি টাকার ব্যাবসা নিয়েও আত্মবিশ্বাস থাকে না, অনেকের দিন কাটে হতাশায়। আর উনাদের ?", "Free Motion");
		addVideoItem("Dj6_r4GvekI", "উনি পথ ভুল করে রাজশাহীর বাঘা, বামন ডাঙ্গা থেকে চাঁদপুরে চলে এসেছেন।", "Free Motion");
		addVideoItem("u5QiiExSkdI", " দুই থেকে আড়াই মাসের একটা ছাগলের বাচ্চা হঠাৎ করে আমার বাইকের নিচে চলে আসে।", "Free Motion");
		addVideoItem("hW01u-j8zWo", "এমন অনেক ফুটফুটে বাচ্চা আছে যারা খানিকটা সাপোর্ট পেলেই আর রাস্তায় ঘুমাতে হয় না।", "Free Motion");


		createPlayList("Session", R.drawable.session);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("Ef6m53id1sI", "Gf vs. Bf ", "Shorts");
		addVideoItem("CDoOGVP6Eik", "Father Vs. Son", "Shorts");
		addVideoItem("5nfP0fWeKKY", "Badi Behen Vs. Choti Behen", "Shorts");
		addVideoItem("ygYzYN71dxI", "Husband Vs. Wife", "Shorts");
		addVideoItem("Fwy4_Q4lTZE", " Kaamwali Bai ", "Shorts");

		addVideoItem("C-SqRjb9Cu8", "Father Vs. Son - Part 2 ", "Shorts");
		addVideoItem("9J6TcBzG0t0", "Badi Behen Vs. Choti Behen - Part 9 ", "Shorts");
		addVideoItem("PYn1MLncmRA", "GF Vs. BF - Beard ki Shaving", "Shorts");
		addVideoItem("1eIkojbUlBA", "Online Delivery Story ", "Shorts");
		addVideoItem("XI-EGeYIF4U", "Shirt Ka Quality Check", "Shorts");

		addVideoItem("MAbaHBKhzgc", "Husband Vs. Wife - Part 12 ", "Shorts");
		addVideoItem("4hUcDAATnME", "Kaamwali Bai - Part 27", "Shorts");
		addVideoItem("OIcBYAqvV08", "Badi Behen Vs. Choti Behen - Part 8", "Shorts");
		addVideoItem("OSQ78uhHYA8", "Husband Vs. Wife - Part 12.2", "Shorts");
		addVideoItem("GHyu-xbNitg", " Kaamwali Bai - Part 26", "Shorts");

		addVideoItem("wSIkjcy2cu0", "Men Will Be Men", "Shorts");
		addVideoItem("2pg-c0pIY3M", "Gf vs. B", "Shorts");
		addVideoItem("WOqi90dy3h8", "Husband Vs. Wife - Part 11", "Shorts");
		addVideoItem("s0JGZt21JVk", "Badi Behen Vs. Choti Behen - Part 7", "Shorts");
		addVideoItem("40foeqhI_8I", " Kaamwali Bai - Part 25", "Shorts");

		addVideoItem("kBkw9QhSgug", "Maa Vs. Beta", "Shorts");
		addVideoItem("GBynk-DfFk8", "Husband Vs. Wife - Part 10", "Shorts");
		addVideoItem("akH5TqIPJuo", "Gf vs. Bf Party", "Shorts");
		addVideoItem("O7eCAWhJ8jQ", "कामवाली बाई और भैया का झगड़ा", "Shorts");
		addVideoItem("KezSHb-eiIc", "Husband Vs Wife - Part 9", "Shorts");

		addVideoItem("04n-VerPYi0", " Gf vs. Bf  Permition part 1.0", "Shorts");
		addVideoItem("7zdQHq34GJI", "Awkward Situations", "Shorts");
		addVideoItem("Tp8n-IJKuVU", "कामवाली बाई और भैया की GF", "Shorts");
		addVideoItem("Jnk3oS_s7wo", "Husband Vs Wife - Part 8", "Shorts");
		addVideoItem("zGJDklWZX2o", "Bachelors Kaamwali Bai - Part 24", "Shorts");

		addVideoItem("vHkNvJip8Ys", "कामवाली बाई और Bachelors Kaamwali Bai - Part 23", "Shorts");
		addVideoItem("iv9WBKMOTcM", "Husband vs Wife Part 7", "Shorts");
		addVideoItem("xUm8Ahnk8uc", "Renovation Kaamwali Bai - Part 21", "Shorts");
		addVideoItem("i5uLLaSGCZE", "Affair Gone Wrong", "Shorts");
		addVideoItem("adwe3mUqaVk", "Kaamwali Bai - Part 22", "Shorts");

		addVideoItem("3TRo7BcnbaI", "Badi Behen Vs Choti Behen - Part 6 ", "Shorts");
		addVideoItem("H4Cc76C4d1s", "Badi Behen Vs Choti Behen Part- 5", "Shorts");
		addVideoItem("MqHGTJgSxv0", "IPL Kaamwali Bai Part 17", "Shorts");
		addVideoItem("R7rWBW9pNG8", "IPL | Kaamwali Bai Part 16 ", "Shorts");
		addVideoItem("8XI_GB-NW7c", "Baby तुम क्या कर रहे हो?", "Shorts");

		addVideoItem("3QaaMdDqybo", "Wallet नहीं मिल रहा? Husband vs Wife Part 4", "Shorts");
		addVideoItem("RyCmd3_kEuE", "कामवाली बाई के लिए आया एक पार्सल!", "Shorts");
		addVideoItem("uXlAH0MsecI", " IPL Kaamwali Bai Part 14", "Shorts");
		addVideoItem("QEMotqb7DMU", "Badi Behen Vs Choti Behen Part 4", "Shorts");
		addVideoItem("nI-Hd2_Ekgg", "कामवाली बाई और मेहमान - Part II", "Shorts");

		addVideoItem("nnGJ8i08Vqw", "अकेलापन कैसे दूर करे?", "Shorts");
		addVideoItem("yVIeKrz6eWc", "Husband vs Wife Part 3", "Shorts");
		addVideoItem("MtwnRAn-p1w", "Tera Jaisa Yaar Kaha!", "Shorts");
		addVideoItem("Cx5c3FI2Lz8", "Naam kya hai Tera??", "Shorts");
		addVideoItem("eqzXJnaWEqU", "जब आप Mall पहली बार जाते हो feat. Kaamwali Bai | Part 9 ", "Shorts");


		createPlayList("Shorts Video", R.drawable.shorts_logos);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("OPl56leYiso", "আলহামদুলিল্লাহ্, আল্লাহ্ কুলছুমের জীবন পরিবর্তনের একটা সুযোগ করে দিলেন।", "Free Motion");
		addVideoItem("ofp6zbIwXLg", "১০ বছরের মেয়ে বলে, কষ্ট করলেই তো মিষ্টি মিলে। আর আমরা হতাশ হয়ে যাই এক নিমিষেই ।", "Free Motion");
		addVideoItem("szRBX14teI8", "সামান্য টাকা পেয়ে কেমন খুশি, অথচ অনেকের ১৭০০ কোটিতে ও মন ভরে না।", "Free Motion");
		addVideoItem("jiyIMSWjSf4", "সামান্য কিছু মূলধনের অভাবে অনেকেই এ পথ বেছে নেয়।", "Free Motion");
		addVideoItem("d67iIYRdHMM", "লকডাউনের মত দূর্যোগ এরা কিভাবে সামলাবে ?", "Free Motion");
		addVideoItem("B1Df102g_f8", "শীতের কষ্ট শুধু এই মানুষেরা বোঝে কারণ শীত সবার জন্য সুখের হয় না, কারো কারো জন্য ঘুমহীন রাত ও হয়।", "We Are Human");
		addVideoItem("tNgrqpuLuRg", "ভালো লাগার কিছু মুহূর্ত ।সাজেকের রাস্তায় বাচ্চাদের পাগলামি।", "We Are Human");
		addVideoItem("uyFX-vJY2PM", "যাদের দু'বেলা খাবারের নিশ্চয়তা নেই, তাদের অসুস্থতা এবং ঔষধের খবর কে রাখে ?", "Free Motion");
		addVideoItem("50Y7Z_WOPac", "পলিথিন দিয়েই চলছে জীবন !", "Free Motion");
		addVideoItem("6R4yS0pRqW4", "বৃদ্ধ বয়সে পুরো গ্রাম ঘুরাটা আসলেই অনেক কষ্টকর, আল্লাহ্ সবাইকে হেফাজত করুক।", "Free Motion");
		addVideoItem("YcSiDfvIWlU", "এক দিন আমার, আপনার, সবার এই ৩টি প্রশ্নের সম্মুখীন হতে হবে।", "Free Motion");
		addVideoItem("ZvAoRrwyE0U", "পেটে ক্ষুধা আর বুকে ভয় নিয়েই চলছে এদের লকডাউনময় জীবন।", "Free Motion");
		addVideoItem("oq59vbGCS1I", "খুশি ছড়িয়ে যাক সবার মাঝে।", "Free Motion");
		addVideoItem("WnNflVTnmXU", "কুড়িগ্রাম কম্বল বিতারণের সময় আমার বলা কিছু কথা মনোযোগ দিয়ে শুনেছিলেন কিছু অসহায় চাচা চাচি।", "We Are Human");
		addVideoItem("QUbN3KYyRsM", "আজ আমার জন্মদিন ছিলো,হঠাৎ মনে হলো মানবতার দৃষ্টি দেখি, এই দিনটাকে স্বরণীয় করে রাখি।", "We Are Human");
		addVideoItem("h6vmCZpGkCM", "যাত্রী ছাড়া রিক্সা চলবে ঠিকই, কিন্তু পেট তো চলবে না।", "Free Motion");
		addVideoItem("ReyNtEFStAA", "আলহামদুলিল্লাহ্, ১৮ বছর পর বাবা তার সন্তান কে খু্ঁজে পেলেন।", "Free Motion");
		addVideoItem("hW01u-j8zWo", "এমন অনেক ফুটফুটে বাচ্চা আছে যারা খানিকটা সাপোর্ট পেলেই আর রাস্তায় ঘুমাতে হয় না।", "Free Motion");
		addVideoItem("a4m4S7S3kEc", "বয়স হয়েছে ৯০+ , যার একটি চোখ অন্ধ,যার মেরুদন্ড বাঁকা,", "Free Motion");
		addVideoItem("rhS8O1xPYUc", "গ্রামের সহজ-সরল মানুষের সাথে কাটানো অসাধারণ কিছু মুহূর্ত।", "We Are Human");
		addVideoItem("2BeZ9hF8nGo", "আজ থেকে এক কাপ চা'আমার কাছে এক দীর্ঘশ্বাসের নাম।", "We Are Human");
		addVideoItem("1tKzbADOrAc", "আমাদের হাজার চাহিদার মাঝে, তার ছোট্ট চাহিদা দেড়শো টাকা।", "We Are Human");
		addVideoItem("5Pl0ASVXGJA", "এখানে প্রতিটা মানুষের একটাই উত্তর ছিলো গায়ে দেওয়ার কম্বল নেই", "We Are Human");
		addVideoItem("v7fnfGAuOxE", "কুড়িগ্রাম জেলায় নলকূপ স্থাপন। (আমরাও মানুষ পেইজের পক্ষ থেকে)", "We Are Human");



		createPlayList("Smile Motion", R.drawable.smile);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("ncIX1IJ_CzI", "New Entertainment Top Funny Video 420", "Episode 01");
		addVideoItem("aRG0Gollusw", "New Entertainment Top Funny Video 420", "Episode 02");
		addVideoItem("fh28ViiMp_4", "New Entertainment Top Funny Video 420", "Episode 03");
		addVideoItem("xnql-5Ny-sc", "New Entertainment Top Funny Video 420", "Episode 04");
		addVideoItem("X23hgHhkdis", "New Entertainment Top Funny Video 420", "Episode 05");
		addVideoItem("HA95VIR0qE8", "New Entertainment Top Funny Video 420", "Episode 06");
		addVideoItem("HEgcfoMhO18", "New Entertainment Top Funny Video 420", "Episode 07");
		addVideoItem("l0-Q3ZgkbzA", "New Entertainment Top Funny Video 420", "Episode 08");
		addVideoItem("1a-QUyAo6Fs", "New Entertainment Top Funny Video 420", "Episode 09");
		addVideoItem("6PjoJ-IFslQ", "New Entertainment Top Funny Video 420", "Episode 10");
		addVideoItem("VYRTCnRxBLM", "New Entertainment Top Funny Video 420", "Episode 11");
		addVideoItem("sLwiG6cBBTw", "New Entertainment Top Funny Video 420", "Episode 12");
		addVideoItem("Kegn5_ANGLM", "New Entertainment Top Funny Video 420", "Episode 13");
		addVideoItem("fYFBSLIp6l8", "New Entertainment Top Funny Video 420", "Episode 14");
		addVideoItem("zhoH_IxWcbk", "New Entertainment Top Funny Video 420", "Episode 15");
		addVideoItem("V_BLCGUmnJw", "New Entertainment Top Funny Video 420", "Episode 16");
		addVideoItem("oFf8QTmmcs8", "New Entertainment Top Funny Video 420", "Episode 17");
		addVideoItem("Y7N5M-JDsc4", "New Entertainment Top Funny Video 420", "Episode 18");
		addVideoItem("uHzpCrRSc20", "New Entertainment Top Funny Video 420", "Episode 19");
		addVideoItem("2Ug2dEKfdyk", "New Entertainment Top Funny Video 420", "Episode 20");
		addVideoItem("Axt2VUrMkns", "New Entertainment Top Funny Video 420", "Episode 21");
		addVideoItem("N2OT63DfTbE", "New Entertainment Top Funny Video 420", "Episode 22");
		addVideoItem("IlezWV9VSgY", "New Entertainment Top Funny Video 420", "Episode 23");
		addVideoItem("SxUyYh6ZLZ8", "New Entertainment Top Funny Video 420", "Episode 24");
		addVideoItem("9p6r5UM4vNo", "New Entertainment Top Funny Video 420", "Episode 25");
		addVideoItem("qw-VPrwR41Y", "New Entertainment Top Funny Video 420", "Episode 26");
		addVideoItem("QVyhXn5hAc8", "New Entertainment Top Funny Video 420", "Episode 27");



		createPlayList("Most View Funny", R.drawable.unlimited_funny);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("G4gLCS3_YLE", "অসৎ তরমুজ ব্যবসায়িদের এই চাচার থেকে শিক্ষা নেওয়া উচিত।", "Humaniti");
		addVideoItem("2BeZ9hF8nGo", "আজ থেকে এক কাপ চা আমার কাছে এক দীর্ঘশ্বাসের নাম।", "Humaniti");
		addVideoItem("TSUwcVNE9dw", "ভালোবাসা নাকি টাকা কোনটার গুরুত্ব বেশি?।", "Humaniti");
		addVideoItem("QUbN3KYyRsM", "আজ আমার জন্মদিন ছিলো,হঠাৎ মনে হলো মানবতার দৃষ্টি দেখি, এই দিনটাকে স্বরণীয় করে রাখি।", "Humaniti");
		addVideoItem("Mlyqkb3Hx8Y", "চোখে দেখে না একদমই,বয়স্ক ভাতার টাকাটা ছেলে খেয়ে দেই,১২০ বছর বয়সে পেট চলে ভিক্ষা করে,আহারে জীবন।", "Humaniti");
		addVideoItem("JJFjFEracHw", "ভালো থাকার চেয়ে,ভালো রাখায় বেশি শান্তি,চলেন ভালো থাকতে নয় ভালো রাখতে শিখি", "Humaniti");
		addVideoItem("mKb9pdc-85o", "ঈমান কতটা মজবুত হলে। এমন অবস্থায় একজন মানুষ বলে আলহামদুলিল্লাহ ভালো আছি।", "Humaniti");
		addVideoItem("hvn3hvsDqZg", "বড় বড় ডিগ্রি ধারী শিক্ষার মাঝে , তুমি শ্রেষ্ঠ শিক্ষা বাবা।", "Humaniti");
		addVideoItem("BDnk3bzfN9I", "আমার নামে প্রতারণা,বাকিটা ভিডিও দেখে জেনে নিন।", "Humaniti");
		addVideoItem("cCMnpUD0Bww", "কেউ ২কোটি টাকা পেয়ে খুশি না, আর কেউ কেউ ২ টাকার মধ্যে সীমাবদ্ধ।", "Humaniti");
		addVideoItem("HCG9IxWIwOA", "সিলেটের বন্যা পরিস্থিতি। কি বলেছেন ব্যারিস্টার সুমন।", "Humaniti");
		addVideoItem("_ZdwBdhtaIU", "ব্যারিস্টার সুমন সিলেট বাসীকে একাই দিলেন ২০ টা কুরবানির গরু।", "Humaniti");
		addVideoItem("2IO-DKWpURQ", "কঠিনভাবে খেপেছে ব্যারিস্টার সুমন। সিলেটের বন্যা পরিস্থিতে কাজ করছে বাচ্চারা।", "Humaniti");
		addVideoItem("LDaA3jgH6UA", "জকিগঞ্জে আশ্রয়কেন্দ্রে কি বললেন ব্যারিস্টার সুমন।", "Humaniti");
		addVideoItem("mFlU9hhepqM", "দেড় কোটি টাকার ব্যাপারে ব্যারিস্টার সুমন কি বলেছে।", "Humaniti");


		createPlayList("Humanity", R.drawable.humanity);
		//==========================================================================



		//========================Sampol==================================================
		addVideoItem("bPi_5xSlpeg", "মর্ডান বৌদি X বেগুন থেরাপি ", "Funny TikTok");
		addVideoItem("iWGzx6zmwFE", "ইংলিশ এ সব ছাত্রী ফেল", "Funny TikTok");
		addVideoItem("Z6Qf7btpjhw", "থাপরা-থাপরি!", "Funny TikTok");
		addVideoItem("82O5K78_fH8", "আল্লাহ প্রতি বিশ্বাস নাই X Tik Tok Viral Girl ", "Funny TikTok");

		addVideoItem("UGG85D9OIX4", "নাচানাচি নাকি ব্যায়াম ft Kazi Maruf", "Funny TikTok");
		addVideoItem("2eKRSRY5JGE", "দেশি বিচিলেস x All About Deshi BTS Roasted", "Funny TikTok");
		addVideoItem("oY2_oSlT_Qk", "Rup Nogorer Rajkonna X Hero Alom X Onamika Oyshe ", "Funny TikTok");
		addVideoItem("Kxmy3K0teCM", "টাকা মেরে দিলো!! বঙ্গবন্ধু বায়োপিক", "Funny TikTok");
		addVideoItem("_rpkRLG5jT8", "ব্যাকবেঞ্চার The রিয়েল!! Backbencher Vs Topper", "Funny TikTok");

		addVideoItem("3k8oJ2D8wvw", "টিকটক এর নায়িকা দীঘি !", "Funny TikTok");
		addVideoItem("OYxRWzRVuZA", "পাতি-নেতা বেটার দেলোয়ার |", "Funny TikTok");
		addVideoItem("_944vbkK9HE", "বাঙালী People In ঈদ x Eid Special", "Funny TikTok");
		addVideoItem("kkLyF7dknJk", "বাবু খাইছো x কাঁচা বাদাম", "Funny TikTok");
		addVideoItem("sF0wp78fzAY", "সিজনাল মুসুল্লি!!", "Funny TikTok");

		addVideoItem("7pr6TnaneeQ", "বারোভাতারি x ৬ বয়ফ্রেন্ড", "Funny TikTok");
		addVideoItem("UokdNhyWa_k", "দেশি বিয়ে বাড়িতে কি হয়...! ", "Funny TikTok");
		addVideoItem("NJc2lvJnlR0", "মা ছেলের নোংরামী with Mon & Son", "Funny TikTok");
		addVideoItem("1pC_F3JX3Rg", "খুরমা-খেজুর with Tik Tok", "Funny TikTok");
		addVideoItem("LgGbQ7YaBzs", "Free Fire Roast X Jannat Gaming x Sadia gaming X Bristy Gaming", "Funny TikTok");

		addVideoItem("wMuYYBw4c-4", "নাটক নাকি নোংরামি! X Bachelor PointSeason 4", "Funny TikTok");
		addVideoItem("G_DfA6JJvoA", "মেয়ের সাথে মেয়ের বিয়ে X Bad Brothers Omor", "Funny TikTok");
		addVideoItem("xhxNsDx3hrk", "এরা কি চাই x বাচ্চারা দূরে |", "Funny TikTok");
		addVideoItem("Rrww9yb0RKg", "গাঁজাখুরি সিরিয়াল ft Bangla Serial Roast ", "Funny TikTok");
		addVideoItem("ki_rFWhbDIA", "তেল এর বাজারে আগুন x বেগুন থেরাপি |", "Funny TikTok");

		addVideoItem("ux8aKKp7ZiU", "খায়রুন সুন্দরী-Khairun Sundari Bangla Funny Movie Review |", "Funny TikTok");
		addVideoItem("pbGtGgzekms", "এরাও বাবা ???(ROASTED) ", "Funny TikTok");
		addVideoItem("gWJqydGGxbk", "এখানে লিংক নিয়ে যান x Tahmina Chowdhury Prity VIRAL VIDEO", "Funny TikTok");
		addVideoItem("L3LaCqPPKfs", "শেষ পরিণতি x The King Boy", "Funny TikTok");
		addVideoItem("tVGRois_KOc", "কাছে আসার গাঁজাখুরি গল্প |", "Funny TikTok");

		addVideoItem("DbMkB34u72w", "কুকীর্তি ফাঁস x জায়েদ খাঁন ", "Funny TikTok");
		addVideoItem("bB5BQ-e1XcM", "এইগুলা কি পুস্পা !!! Puspa The Tiktokers", "Funny TikTok");
		addVideoItem("cqjdcsYev_Q", "গিলে গিলে খা!! Maddy Eating Show Roast", "Funny TikTok");
		addVideoItem("v_KjBUgKfnY", "মন্টি বৌদি কিভাবে করলো ft Monti Roy Roast |", "Funny TikTok");
		addVideoItem("bPSIX00uM-A", "হিজাব পরে বাণিজ্য মেলায় নোংরামি |", "Funny TikTok");
		addVideoItem("", "", "Funny TikTok");

		addVideoItem("ngv5e5Eax0c", "এক্স কে ধুয়ে দিলাম!!!", "Funny TikTok");
		addVideoItem("বাচ্চার বাবা কে বেড়িয়ে এলো!!", "বাচ্চার বাবা কে বেড়িয়ে এলো!!", "Funny TikTok");
		addVideoItem("OPdOSFLCpVg", "ফেসবুক মঠেল x লারেলাপা", "Funny TikTok");
		addVideoItem("BmXBZKy-ZFg", "হাপের বাচ্চা বৌদি!!", "Funny TikTok");
		addVideoItem("qIywo92EmTA", "২০২১ এর ভাইরাল সব বিনোদন |", "Funny TikTok");
		addVideoItem("KXB-Og1oqpY", "বাংলা মুভির নোংরা গান!! ", "Funny TikTok");
		addVideoItem("_5k9oEHw3fI", "ক্রিকেটারদের কঠিন ধুয়ে দিলো", "Funny TikTok");


		addVideoItem("QJuOrP5qIQ8", " Cute, Romantic & Sad Videos.", "Funny TikTok");
		addVideoItem("4zNLkBN1uXQ", "Bangla New Tiktok Musical Video", "Funny TikTok");
		addVideoItem("ktixfWJSC4o", "Abraz Khan and Shoeb Khan New Funny Video", "Funny TikTok");
		addVideoItem("W3dDzqgocQI", "AWW NEW FUNNY Videos ", "Funny TikTok");
		addVideoItem("gU8GcHEvDjw", "Sad Tik Tok Videos ", "Funny TikTok");

		addVideoItem("fuxRypMFSNc", "Parul And Veer Indori Funny Video", "Funny TikTok");
		addVideoItem("xzSYgLJ0v4E", "New Funny Video | Part 10", "Funny TikTok");
		addVideoItem("g42GpS_lAyA", "নতুন সালের সেরা ধামাকা", "Funny TikTok");
		addVideoItem("qAtWUSMC4Ns", "কোরবানীতে গরু নিয়ে ঘটে যাওয়া কিছু মজার দৃশ্য ", "Funny TikTok");
		addVideoItem("ACu7LMfO8Mo", "New Trend Song Habibi", "Funny TikTok");

		addVideoItem("7gAbd9wTvjw", "ঈদের নতুন টিকটক | হাঁসি না আসলে এমবি ফেরত |", "Funny TikTok");
		addVideoItem("iTBS3CodF9Q", "বাহিনীদের টিকটক ভিডিও (Part-3)", "Funny TikTok");
		addVideoItem("L06vUVd9lGM", "Worst Tiktok Videos | Tiktok Roast EP01", "Funny TikTok");
		addVideoItem("oSa-t_ke1qI", "মাফ চাই টিকটকারদের কাছে!", "Funny TikTok");
		addVideoItem("fNcxQGi-2dI", "এরা কারা সানি খলিফা x TikTok Roast", "Funny TikTok");

		addVideoItem("cDUPK3617HM", "Reacting to Cringy TikTok 2", "Funny TikTok");
		addVideoItem("qLkpfZoc8VI", "Reply To Xannat Gaming and Fiza Gaming", "Funny TikTok");
		addVideoItem("naHhIhf7pXM", "পদ্মা সেতু নাকি টিকটক কেন্দ্র?", "Funny TikTok");
		addVideoItem("Mc4UpGe0cWM", "হাস্যকর TikTok Video | Tik Tok Roast Ft Mariya Nooni ", "Funny TikTok");
		addVideoItem("ZVl5nMrDSnI", "গার্ল-ফ্রেন্ড নাই | Girlfriend Nai", "Funny TikTok");

		addVideoItem("yp5PuyGoMuU", "গাঁজাখুরি গল্প | Closeup Kache Ashar Oshomapto Golpo", "Funny TikTok");
		addVideoItem("ygbInl9HMmM", "হাস্যকর TikTok Video", "Funny TikTok");
		addVideoItem("ZORP5gRjRhQ", "অস্থির শীতে বেগুন থেরাপি | Worst Bangla Song Ever ", "Funny TikTok");
		addVideoItem("Aj2w1HdiDjQ", "বাপ্পি দা এর খিচুড়ি | Bappy Chaudhury Roasted", "Funny TikTok");

		addVideoItem("WmjT0ou8uB4", "ঢেলে দেই - DHELE DEI ", "Funny TikTok");
		addVideoItem("_3bW2tLEhCI", "সালামি না দিয়া Tumi Jaio Na", "Funny TikTok");
		addVideoItem("yGrqnQSZNI", "এগুলা কি বিজ্ঞাপন || BANGLADESHI FUNNY TV ADS ", "Funny TikTok");
		addVideoItem("5s96zz7vTWg", "Gully Boy Part 3 -এরা কারা", "Funny TikTok");

		addVideoItem("O0JA_gjKk74", "এই নোংরামির শেষ কোথায়??", "Funny TikTok");
		addVideoItem("skNRSbrzBYw", "কুরবানি নাকি showofff??", "Funny TikTok");
		addVideoItem("Exqj3Bw51G4", "Please STOP", "Funny TikTok");
		addVideoItem("AL76axyes7w", "Tiktok naki NONGRAMi", "Funny TikTok");

		addVideoItem("UqlSjYRO8sQ", "টাকা নাকি মাদ্রাসা?? (ভাইরাল সুমাইয়া)", "Funny TikTok");
		addVideoItem("_wrsxKFQ73I", "ajke amar mon valo nei with TIKTOKER", "Funny TikTok");
		addVideoItem("6cOsC_M6ilU", "ami naki বিড়িখোর দাদু ??", "Funny TikTok");
		addVideoItem("aAxGlEcx1T0", "Video Remove কেন করতে হলো??", "Funny TikTok");

		addVideoItem("GD53Yn-U5KA", "Zayed Khan vs Omor Sani", "Funny TikTok");
		addVideoItem("hVGoRj8XkFo", "Please Stop Teddy FUN", "Funny TikTok");
		addVideoItem("f_GmvPPa6v0", "Stop This Gajar Gan (আমার ভীষন কষ্ট হয়)", "Funny TikTok");
		addVideoItem("08xjlkayecE", "deshi BTS", "Funny TikTok");
		addVideoItem("jeINjF69HXk", "Please Stop This Nongrami", "Funny TikTok");

		addVideoItem("HzLXGKw3RCM", "Roasting হয় না???", "Funny TikTok");
		addVideoItem("KFiLuqFFj8w", "Bhalobasar Khusi Apu", "Funny TikTok");
		addVideoItem("Z6C4iSmgUFg", "Boudi Naki Modern with TIKTOKER", "Funny TikTok");
		addVideoItem("vPMqjiptRuM", "Hero Alom the Rup Nogor er Raja", "Funny TikTok");
		addVideoItem("VjfpTC1TNG4", "Xannat Gaming vs Sadia's Gaming", "Funny TikTok");

		addVideoItem("0v-Cuoz5SDE", "Worst Eating Show of India", "Funny TikTok");
		addVideoItem("sjwqVta7aIg", "Ruper Jadu with TIKTOKER", "Funny TikTok");
		addVideoItem("meDUfrsDXKY", "Tips Apur premer Tutorial", "Funny TikTok");
		addVideoItem("fgjRo7Fq5F8", "Kirim afa amader PABNAi", "Funny TikTok");
		addVideoItem("KNAYevqknCM", "Magician TIKTOKER", "Funny TikTok");

		addVideoItem("ym2BLY0MV3E", "Delowar KEDA | তোর বড় ভাইদের জিগা দেলোয়ার কেডা", "Funny TikTok");
		addVideoItem("qJHc1vsl1lk", "MOM and SON (part 3)", "Funny TikTok");
		addVideoItem("0WR0sGjmGpw", "Anamika Oyshee the national CRUSH", "Funny TikTok");
		addVideoItem("3xtxVCXMQWg", "KGF Chapter 2 full movie REVIEW", "Funny TikTok");




		createPlayList("বিনোদন video", R.drawable.entertaiment);
		//==========================================================================


		//========================Sampol==================================================
		addVideoItem("ZvAoRrwyE0U", "পেটে ক্ষুধা আর বুকে ভয় নিয়েই চলছে এদের লকডাউনময় জীবন।", "Most Views");
		addVideoItem("nCz9Arorj0I", "কোটি টাকা থাকলে ও আপনি দান করতে পারবেন না, যদি আল্লাহ্ না কবুল করে।", "Most Views");
		addVideoItem("yH5_TDKoGR8", "এ রকম অনেক ছেলেমেয়ে আছে যারা ভিক্ষা করতে আগ্রহী না। কারন ভিক্ষা লজ্জার, ব্যাবসা গর্বের।", "Most Views");
		addVideoItem("JDvRhcM50T0", "সবার ঈদে পূর্ণতা আসুক।", "Most Views");
		addVideoItem("98ALaV5VuGY", "ঈমান যদি মজবুত হয় তাহলে কোটি টাকার প্রলোভন ও তার কাছে তুচ্ছ।", "Most Views");
		addVideoItem("Bgccd_hhoNg", "চুলা ভরা পানি ভাত খেতে ইচ্ছে করে কিন্তু চালগুলো নষ্ট হয়ে গেছে।", "Most Views");
		addVideoItem("Otnj91nPJLc", "আমরাও মানুষ", "Most Views");
		addVideoItem("j6QoAu8U5XI", "হে আল্লাহ তুমি এমন সন্তান দিওনা,যে সন্তান বাবা, মায়ের খোঁজ রাখে না।", "Most Views");
		addVideoItem("PH5ynJCmvDk", "আলহামদুলিল্লাহ আমার ঈদের দিন", "Most Views");
		addVideoItem("hi1UKi8BcU4", "প্রয়োজন না হলেও কিছু একটা জিনিস কিনে এই মানুষগুলোকে একটু সহযোগিতা করবেন।", "Most Views");
		addVideoItem("4K5DHBtJTog", "মায়াবতী জেসমিন । Part 01", "Most Views");
		addVideoItem("NXEjpnWMrMY", "মায়াবতী জেসমিন। Part 02", "Most Views");
		addVideoItem("kB-PT8eMYr0", "কিছু সারপ্রাইজ মানুষকে বাকরুদ্ধ করে দেয়।", "Most Views");
		addVideoItem("vfe7Xx4aJyE", "ময়লাওয়ালা নয়, এরা পরিচ্ছন্ন কর্মী।", "Most Views");
		addVideoItem("uV89pv5Y3i0", "আমার জন্য না, আমার মায়ের জন্য লাগবে।", "Most Views");
		addVideoItem("evXnozEFoR4", "রমজান মাসে সবার মাঝে ছড়িয়ে পড়ুক ভালোবাসা।", "Most Views");
		addVideoItem("3Fg2hfzBRDs", "অর্থ কম তবে এই অর্থের সাথে আমার অনেক ভালোবাসা জড়িয়ে আছে।", "Most Views");
		addVideoItem("4o_sVjjI0e0", "একটা পরিবারের কালো অধ্যায় নেমে আসার পিছনের গল্পটা খুবই ছোট", "Most Views");
		addVideoItem("nCz9Arorj0I", "কোটি টাকা থাকলে ও আপনি দান করতে পারবেন না, যদি আল্লাহ্ না কবুল করে।", "Most Views");
		addVideoItem("D2mLhKuWQT4", "চারদিকে এতো এতো ভেজাল জিনিষের ভিড়ে এরা বিক্রি করে ভালোবাসা ।", "Most Views");
		addVideoItem("GrKjqDJiM9M", "কামরাইলে কি করমু বাবা ?", "Most Views");
		addVideoItem("Z-st2jkKm7M", "আমাদের চট্টগ্রাম ভালো নেই।", "Most Views");
		addVideoItem("Ogyy64KSHbQ", "শেষ মেষ নিজের মুখে বলে প্রমাণ করানো লাগলো আমি পাগল না", "Most Views");
		addVideoItem("RwCf9SHJzl8", "শান্তি শুরু হয় হাসি থেকে একটি মিষ্টি হাসি সারাজীবনের শান্তির প্রতিক।", "Most Views");
		addVideoItem("E9YTqq6VBLE", "বৃদ্ধ বয়সে আমাদের কারো শেষ পরিণতি যেনো এমন না হয়।", "Most Views");
		addVideoItem("HlqVNI7ahYQ", "আমাদের মতো গরিবদের কেউ ভালোবাসে না।", "Most Views");
		addVideoItem("XIrsfxAsQrk", "আমি অনেক খুশি,বাণীতে শসা বিক্রেতা চাচা।", "Most Views");
		addVideoItem("O-Xg9-_lIG4", "ভাগ্য আল্লাহ্ কর্তৃক নির্ধারিত।", "Most Views");


		createPlayList("Viral Video", R.drawable.video_galary);
		//==========================================================================

		//========================kaissa==================================================
		addVideoItem("3pMEqBOQZjw", "নতুন ব্রিজ পুরোনো নাটক", "Kaissa Comedy (01)");
		addVideoItem("BrYdEh7JO8g", "কাইশ্যা বন্যা সুবিধাবাদি", "Kaissa Comedy (02)");
		addVideoItem("_zI5pf2k7FM", "তেল আটার দাম কমে না,কাইশ্যার জীবন বেদনা", "Kaissa Comedy (03)");
		addVideoItem("ZnyvaamNPeA", "কাইশ্যা ঘুষখোর ", "Kaissa Comedy (04)");
		addVideoItem("iWRFqUnWcPA", " কাইশ্যা আজ আমার মন খারাপ", "Kaissa Comedy (05)");

		addVideoItem("dsk8zCNCVUA", "কাইশ্যা বাতেন হাস্যকর বাহাদূরী", "Kaissa Comedy (06)");
		addVideoItem("tdG1MCkwtBg", "কাইশ্যার সামুরাই যুদ্ধ", "Kaissa Comedy (07)");
		addVideoItem("lf8fEkFqdjk", "কাইশ্যার মুলা পরিবার", "Kaissa Comedy (08)");
		addVideoItem("0LE2gfGmn7E", "কাইশ্যার কোটি টাকার ব্যবসা", "Kaissa Comedy (09)");
		addVideoItem("0z2U2tgI0oM", "কাইশ্যার খেলার মাঠ নাই", "Kaissa Comedy (10)");

		addVideoItem("SAy_EkxV8Sg", "কাইশ্যার নতুন অদ্ভুত চাকরি ", "Kaissa Comedy (11)");
		addVideoItem("9IDrf-Y2p3M", "কাইশ্যা যখন রকির ওস্তাদ,,,, KGF Chapter 2 Trainer", "Kaissa Comedy (12)");
		addVideoItem("iWRFqUnWcPA", "কাইশ্যা আজ আমার মন খারাপ ", "Kaissa Comedy (13)");
		addVideoItem("ChRG9N40_fw", " কাইশ্যার বার'শ টাকার কাহিনী ", "Kaissa Comedy (14)");
		addVideoItem("K2LcB3p0rwM", "কাইশ্যার সার্টিফিকেট", "Kaissa Comedy (15)");

		addVideoItem("NrqAX8mHu0U", "কাইশ্যা বনাম নেতা বাতেন", "Kaissa Comedy (16)");
		addVideoItem("IiAMKZGVr6Q", " কাইশ্যার পৃথিবীর সবচেয়ে বড় বিড়ি", "Kaissa Comedy (17)");
		addVideoItem("TyYJDrTQwyg", "কাইশ্যা পরিবার পরিণতি", "Kaissa Comedy (18)");
		addVideoItem("Ec0z9_XZ8hI", "কাইশ্যা সৎ বাবা", "Kaissa Comedy (19)");
		addVideoItem("dVWWT7CGSyc", "কাইশ্যার ডিপ ফ্রিজে হানিমুন ", "Kaissa Comedy (20)");

		addVideoItem("lReRIT5sLm8", "কাইশ্যার টিউবওয়েল কমেডি", "Kaissa Comedy (21)");
		addVideoItem("QKl-DoJ-Mxk", "কাইশ্যার টেলিফোন ট্রাবল", "Kaissa Comedy (22)");
		addVideoItem("bUjYdyqfKpk", "Kaissa Funny Happy New Year", "Kaissa Comedy (23)");
		addVideoItem("kIEUZF48Pvk", " কাইশ্যার বদনা মার্কা নির্বাচন ", "Kaissa Comedy (24)");
		addVideoItem("8HezQXiEJq0", "বেল চেপে দৌড় কাইশ্যা ", "Kaissa Comedy (25)");

		addVideoItem("NS3o5Wdbe7w", "কাইশ্যার ঘুম ঘটনা", "Kaissa Comedy (26)");
		addVideoItem("DYhubiiktuc", "কাইশ্যা কাঁচা বাদাম", "Kaissa Comedy (27)");
		addVideoItem("7OTQ6azlsgE", "Kaissa Funny Prisoner ", "Kaissa Comedy (28)");
		addVideoItem("dxy78Hu_iZc", "কাইশ্যা ন্যাকামি ভালোবাসা", "Kaissa Comedy (29)");
		addVideoItem("VuTXXsF7eAk", "কাইশ্যা মুলার জুস", "Kaissa Comedy (30)");

		addVideoItem("U4b_oh7_l8I", "কাইশ্যাকে এতরাতে কল দিল কে।", "Kaissa Comedy (31)");
		addVideoItem("OFh9H5S7Bao", "কাইশ্যার বউয়ের সাথে যুদ্ধক্ষেত্র", "Kaissa Comedy (32)");
		addVideoItem("KP5imyeWJ4s", "কাইশ্যা স্কুইড গেম", "Kaissa Comedy (33)");
		addVideoItem("QubsGRuxgeQ", "কাইশ্যা এখন ড্রাকুলা", "Kaissa Comedy (34)");
		addVideoItem("yZlc_Uft1nU", "কাইশ্যা ইকমার্স ফকির", "Kaissa Comedy (35)");

		addVideoItem("huSF3JEe-t8", "কাইশ্যার কিডন্যাপ কাহিনী", "Kaissa Comedy (36)");
		addVideoItem("MsQ9oP0rCV8", "কাইশ্যা বিশ্বের সেরা সেলসম্যান ", "Kaissa Comedy (37)");
		addVideoItem("zu5bzeA_HDU", " কাইশ্যার সারপ্রাইজ বক্স", "Kaissa Comedy (38)");
		addVideoItem("XUPoHWlOSV4", "কাইশ্যা এবং ঐতিহাসিক লিফট", "Kaissa Comedy (39)");
		addVideoItem("t19I2ANHVNY", "কাইশ্যা ড্রাইভিং স্কুল", "Kaissa Comedy (40)");

		addVideoItem("ifrFgmqgm44", "কাইশ্যার দুর্দান্ত রিমান্ড", "Kaissa Comedy (41)");
		addVideoItem("bY3sjSSoM38", " কাইশ্যা টাকা সুখ", "Kaissa Comedy (42)");
		addVideoItem("SwLrxtD01vE", "কাইশ্যার ঝড়ের দিনের পালকি", "Kaissa Comedy (43)");
		addVideoItem("yZiX7iR5-Zk", "কাইশ্যার গার্লফ্রেন্ডের টয়লেট", "Kaissa Comedy (44)");
		addVideoItem("vmk3NHmqzhA", " কাইশ্যার বর্ষাকাল Part 01", "Kaissa Comedy (45)");

		addVideoItem("IdJt8dfWfVc", "কাইশ্যার বর্ষাকাল Part 02", "Kaissa Comedy (46)");
		addVideoItem("fvWm_Fk9yAw", "বিশ্বসেরা টিভি রিপোর্টার কাইশ্যা ", "Kaissa Comedy (47)");
		addVideoItem("k5U3xRZEE_E", "কাইশ্যার মাস্তানি", "Kaissa Comedy (48)");
		addVideoItem("cinb3Gwi480", "প্রতিবেশী ঝগড়া Part 1", "Kaissa Comedy (49)");
		addVideoItem("pT3Qxh4FiTk", "প্রতিবেশী ঝগড়া Part 2", "Kaissa Comedy (50)");

		addVideoItem("CfBDBFMtH34", "কাইশ্যা শেফালী ফার্নিচার", "Kaissa Comedy (51)");
		addVideoItem("qjC3mEyY4jU", "কাইশ্যা ঘুষখোর মাতাল", "Kaissa Comedy (52)");
		addVideoItem("PS-2l-Wl5R4", "কাইশ্যার প্রেম যুদ্ধ", "Kaissa Comedy (53)");
		addVideoItem("nlFKnlJll6c", " কাইশ্যা বিয়ে যুদ্ধ", "Kaissa Comedy (54)");
		addVideoItem("2lu99G_SJes", "ট্রেনে কাইশ্যার জ্বালাতন", "Kaissa Comedy (55)");

		addVideoItem("27cQ88HZGuk", " কাইশ্যা তরমুজ ভূত", "Kaissa Comedy (56)");
		addVideoItem("l581o16HrTI", "Kaissa Funny Watermalon Trailer", "Kaissa Comedy (57)");
		addVideoItem("V8qCVK9uqjE", "কাইশ্যা ভিক্ষুক", "Kaissa Comedy (58)");
		addVideoItem("YNHih_UKjjw", "মার্কেটে যেতে দিবি না ?", "Kaissa Comedy (59)");
		addVideoItem("4WZalB5_EXk", "কাইশ্যা ঘুষখোরের বউ", "Kaissa Comedy (60)");

		addVideoItem("ngr-us60JVc", "কাইশ্যা বিজ্ঞানী", "Kaissa Comedy (61)");
		addVideoItem("Tn3ZryOu7WA", "কাইশ্যা গরু চোর", "Kaissa Comedy (62)");
		addVideoItem("OFh9H5S7Bao", " কাইশ্যার বউয়ের সাথে যুদ্ধক্ষেত্র", "Kaissa Comedy (63)");
		addVideoItem("KP5imyeWJ4s", " কাইশ্যা স্কুইড গেম", "Kaissa Comedy (64)");
		addVideoItem("QubsGRuxgeQ", "কাইশ্যা এখন ড্রাকুলা", "Kaissa Comedy (65)");

		addVideoItem("C0eMokQAsLw", "কাইশ্যার পড়ালেখা", "Kaissa Comedy (66)");
		addVideoItem("GBTyLhaAswc", "কাইশ্যা নিষ্ঠুর বাবা ", "Kaissa Comedy (67)");
		addVideoItem("4ZAjDXRubu4", "কাইশ্যা বাতেন নেতা ", "Kaissa Comedy (68)");
		addVideoItem("agxAl8YU_mE", "কাইশ্যার সম্পত্তির লোভ", "Kaissa Comedy (69)");
		addVideoItem("XKEzrcMsmCU", "কাইশ্যা মেকাপ এবং নুডুলস", "Kaissa Comedy (70)");

		addVideoItem("tu191TVthCk", "কাইশ্যার ভয়ানক প্রেমের প্রস্তাব", "Kaissa Comedy (71)");
		addVideoItem("r_BF5CZH4oE", "কাইশ্যার ব্রেকাপ", "Kaissa Comedy (72)");
		addVideoItem("FmFNRIctRoE", "ইঞ্জেকশান ডাক্তার কাইশ্যা", "Kaissa Comedy (73)");
		addVideoItem("srmbeNdT5TQ", "কাইশ্যার বীমা কোম্পানি", "Kaissa Comedy (74)");
		addVideoItem("0Moemv9CZBU", "কাইশ্যার নতুন চুলের কাট ", "Kaissa Comedy (75)");


		addVideoItem("iXyyvV0H2Ho", "দাঁতের ডাক্তার কাইশ্যা", "Kaissa Comedy (76)");
		addVideoItem("K1j9xCGXL30", " কাইশ্যার হোস্টেল জীবন", "Kaissa Comedy (77)");
		addVideoItem("JG5KOCdDYeY", " Enjoy All Hit Episodes in One Video", "Kaissa Comedy (78)");
		addVideoItem("IsUiKQ9KfNo", "কাইশ্যা নানা গরু চোর", "Kaissa Comedy (79)");
		addVideoItem("O9A5H37_feM", " কম্বল চোর এখন কাইশ্যার জিজ্ঞাসাবাদে", "Kaissa Comedy (80)");

		addVideoItem("oH3ouN6-ChY", " কঠিন বড়লোক পরিবার ", "Kaissa Comedy (81)");
		addVideoItem("EV4YNaUe888", " কাইশ্যা যখন জ্যোতিষী", "Kaissa Comedy (82)");
		addVideoItem("MGeCWBVLWuY", "কাইশ্যার লাল জামা", "Kaissa Comedy (83)");
		addVideoItem("mX6fuFzfwqs", "পৃথিবীর শ্রেষ্ঠ সামুরাই কাইশ্যা", "Kaissa Comedy (84)");
		addVideoItem("0TyfcjFNp_Q", "কাইশ্যা যখন চোর", "Kaissa Comedy (85)");

		addVideoItem("Ez-AVBGZGFI", "ঘুমের প্যারায় অজ্ঞান কাইশ্যা", "Kaissa Comedy (86)");
		addVideoItem("GrEKkALelEs", "ডাক্তার কাইশ্যার অদ্ভুত রুগী", "Kaissa Comedy (87)");
		addVideoItem("aDBrYs1vrTU", "কাইশ্যা ও বাতেনের যৌথ অভিযান ", "Kaissa Comedy (88)");
		addVideoItem("Hi2GuBbFgr8", "কাইশ্যার উপর এলিয়েনের হামলা", "Kaissa Comedy (89)");
		addVideoItem("YFvL4-0hZ-c", "কাইশ্যা সেরা সুবিধাবাদী", "Kaissa Comedy (90)");

		addVideoItem("1DaV0wW90lE", "কাইশ্যার হিরোগিরি", "Kaissa Comedy (91)");
		addVideoItem("GDn-vpfRA9o", "কাইশ্যা মজার প্রেমের গল্প ", "Kaissa Comedy (92)");
		addVideoItem("wCw5IbVBnsA", "কাইশ্যা ও লাতুর সেলুন", "Kaissa Comedy (93)");
		addVideoItem("n4qEDy2XnIg", " কাইশ্যা যখন মা", "Kaissa Comedy (94)");
		addVideoItem("hhdZnsJ2GGA", "কাইশ্যা যখন গলফ শিক্ষক", "Kaissa Comedy (95)");

		addVideoItem("Oh0_zTN-siM", "কাইশ্যা যখন বিউটিশিয়ান ", "Kaissa Comedy (96)");
		addVideoItem("RnjEsTK8sDA", "কাইশ্যা যখন রাঁধুনি", "Kaissa Comedy (97)");
		addVideoItem("fuj5rhJdFro", "কাইশ্যা যখন জাদুকর ", "Kaissa Comedy (98)");
		addVideoItem("LrlLFOfFdXE", "কাইশ্যার বৌ", "Kaissa Comedy (99)");







		createPlayList("কাইশ্যা Funny", R.drawable.monkey);
		//==========================================================================













		//========================Sampol==================================================
		addVideoItem("W6O2Hxpva14", "সিলেটে ডাকাতির রহস্য ফাঁস। সিলেটের বন্যা পরিস্থিতি", "News");
		addVideoItem("a4PtoIS3ugI", "ব্যারিস্টার সুমনের খাদ্যের ট্রাক পানিতে পড়ে গেছে।", "News");
		addVideoItem("QLlpmRHQajM", "চরম হুংকার দিলেন ব্যারিস্টার সুমন।", "News");
		addVideoItem("mnz5v2MfyXc", " একাই দিলেন ৮৭ লক্ষ টাকা ব্যারিস্টার সুমন।", "News");
		addVideoItem("v1bcwz-orqI", "সিলেটের বন্যা পরিস্থিতি। ৭০লক্ষ টাকা দিয়ে কি করলেন ব্যারিস্টার সুমন।", "News");
		addVideoItem("iQWWzjusxDk", "সিলেটের বন্যা ভয়াবহ রূপ নিল।", "News");

		createPlayList("News", R.drawable.news);
		//==========================================================================


		//========================Sampol==================================================

		addVideoItem("7rOtz71nYAE", "ভাবি পটানোর কৌশল বললেন জেনি! Ha Show (হা শো ) ", "Ha Show");
		addVideoItem("XkI_lb9z760", "জেনি(Jenny) on Ha Show (হা শো ) Season 05, Episode 20", "Ha Show");
		addVideoItem("bFQK60BtLkY", "জেনি(Jenny) on Ha Show (হা শো ) Season 05, Episode 25", "Ha Show");
		addVideoItem("uHctnS-Auxc", "জেনি(Jenny) on Ha Show (হা শো ) Season 05, Episode 31 ", "Ha Show");
		addVideoItem("tiBmmVXTcYI", "জেনি| jenny | Ha Show (হা শো ) Season 05, EP : 42", "Ha Show");


		createPlayList("এলাকার ভাবি", R.drawable.jeni);
		//==========================================================================






	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}


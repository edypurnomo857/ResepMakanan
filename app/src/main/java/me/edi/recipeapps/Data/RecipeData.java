package me.edi.recipeapps.Data;

import java.util.ArrayList;

import me.edi.recipeapps.Adapter.RecipeAdapter;

public class RecipeData {
    public static String[][] data = new String[][]{
            {"Jamur Crispy Saus Asam Manis", "Masakan Makan Malam",
                    "https://img-global.cpcdn.com/003_recipes/4508c976bc5f4a2a/640x640sq70/photo.jpg",
                    "1.\t1 pak Jamur tiram (kurang lebih 1/4 kilo kayaknya ini)\n" +
                            "2.\t200 gr tepung terigu\n" +
                            "3.\t100 gr tepung beras\n" +
                            "4.\t50 gr tepung bumbu serbaguna\n" +
                            "5.\t1/2 sdt kaldu bubuk\n" +
                            "6.\t1/4 sdt baking powder\n" +
                            "7.\t1/2 sdt merica bubuk\n" +
                            "8.\t1 mangkuk air es untuk celupan\n" +
                            "9.\tBahan Saus Asam Manis:\n" +
                            "10.\t3 sdm saus asam manis\n" +
                            "11.\t2 sdm saus tomat\n" +
                            "12.\t2 sdm saus sambal\n" +
                            "13.\t1 sdm saus tiram\n" +
                            "14.\t1 buah bawang bombay, iris tipis melintang\n" +
                            "15.\t1/2 buah wortel, potong korek api\n" +
                            "16.\t1 buah cabe merah besar, potong serong\n" +
                            "17.\t1 buah cabe hijau besar, potong serong\n" +
                            "18.\t1/2 sdt merica bubuk\n" +
                            "19.\tsecukupnya gula\n" +
                            "20.\t100 ml air\n"
            },
            {
                    "Macaroni Schotel Jamur Kukus", "Jamur Spesialis",
                    "https://img-global.cpcdn.com/003_recipes/f4603b649f9d2c1a/260x366cq50/photo.jpg",
                    "1.\t100 gr Macaroni elbow\n" +
                            "2.\t50 ml susu\n" +
                            "3.\t1 bgks jamur champignon potong kecil-kecil\n" +
                            "4.\t1 sdt margarin\n" +
                            "5.\t1 butir telur\n" +
                            "6.\t1/4 potong bawang bombay\n" +
                            "7.\tsecukupnya garam\n" +
                            "8.\t1/2 mangkok kecil Keju cheddar yang sudah diparut\n" +
                            "\n"
            },
            {
                    "Pepes Jamur", "Makan Malam",
                    "https://selerasa.com/images/sayuran/Resep-pepes-jamur-tiram222.jpg",
                    "1.\t3 bungkus Jamur tiram\n" +
                            "2.\t100 gram daging ayam dada tanpa tulang\n" +
                            "3.\t100 gram Tahu putih\n" +
                            "4.\t1 butir Telur\n" +
                            "5.\t3 ikat Kemangi\n" +
                            "6.\t5 siung Bawang merah\n" +
                            "7.\t2 siung Bawang putih\n" +
                            "8.\tsecukupnya Cabe rawit (utuh)\n" +
                            "9.\tsecukupnya Garam\n" +
                            "10.\tsecukupnya Royco\n" +
                            "11.\tDaun pisang untuk membungkus\n" +
                            "\n"
            }
    };

    public static ArrayList<RecipeAdapter> getListData() {
        RecipeAdapter bg = null;
        ArrayList<RecipeAdapter> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bg = new RecipeAdapter();
            bg.setName(data[i][0]);
            bg.setDesc(data[i][1]);
            bg.setPhoto(data[i][2]);
            bg.setRecipe(data[i][3]);


            list.add(bg);
        }

        return list;
    }

}

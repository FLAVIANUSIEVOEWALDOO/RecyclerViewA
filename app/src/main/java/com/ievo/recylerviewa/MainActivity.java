package com.ievo.recylerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Albania adalah sebuah negara yang terletak di wilayah Balkan di Eropa Tenggara. Meskipun negara ini memiliki luas wilayah yang relatif kecil, Albania kaya akan sejarah, budaya, dan keindahan alam yang menakjubkan.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/72/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("India");
        nm.setDeskripsi("India adalah sebuah negara yang mempesona di Asia Selatan, yang terkenal dengan kekayaan budaya, sejarah yang panjang, dan keragaman alam yang luar biasa. Dengan populasi lebih dari satu miliar orang, India adalah negara demokrasi terbesar di dunia dan memiliki peran yang penting dalam politik global, ekonomi, dan budaya.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/72/India-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Brazil");
        nm.setDeskripsi("Brazil adalah negara terbesar di Amerika Selatan dan merupakan salah satu negara paling beragam secara budaya dan alam di dunia. Dikenal karena hutan hujan Amazon yang luas, pantai yang indah, serta perayaan samba dan karneval yang meriah, Brazil memiliki daya tarik yang unik bagi wisatawan dan peneliti.");
        nm.setUrl("https://icons.iconarchive.com/icons/icons-land/vista-flags/72/Brazil-Flag-1-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Canada adalah negara yang terletak di bagian utara Amerika Utara dan merupakan negara terbesar kedua di dunia berdasarkan luas daratan. Dikenal dengan lanskap alam yang menakjubkan, keragaman budaya, dan sistem politik yang stabil, Kanada memiliki daya tarik yang unik bagi penduduknya dan wisatawan.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/72/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Finlandia");
        nm.setDeskripsi("Finlandia adalah sebuah negara yang terletak di wilayah Eropa Utara. Negara ini terkenal dengan keindahan alamnya, inovasi teknologi, dan sistem pendidikan yang sangat baik.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/72/Finland-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Panama");
        nm.setDeskripsi("Panama adalah sebuah negara di Amerika Tengah yang terkenal dengan Terusan Panama, salah satu jalur pelayaran terpenting di dunia yang menghubungkan Samudera Atlantik dan Samudera Pasifik. Selain itu, Panama juga memiliki keindahan alam yang menakjubkan, warisan budaya yang kaya, dan ekonomi yang berkembang pesat.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/72/Panama-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}
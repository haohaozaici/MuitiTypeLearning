package io.github.haohaozaici.muititypelearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.recycler_view)
  RecyclerView recyclerView;

  private MultiTypeAdapter adapter;

  private Items items;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    adapter = new MultiTypeAdapter();
    adapter.register(Category.class, new CategoryViewBinder());
    adapter.register(Song.class, new SongViewBinder());

    recyclerView.setAdapter(adapter);
    adapter.setItems(items);
    adapter.notifyDataSetChanged();


  }
}

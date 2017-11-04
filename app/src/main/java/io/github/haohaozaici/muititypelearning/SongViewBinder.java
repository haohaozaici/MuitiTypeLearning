package io.github.haohaozaici.muititypelearning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by haoyuan on 2017/9/16.
 */
public class SongViewBinder extends ItemViewBinder<Song, SongViewBinder.ViewHolder> {

  @NonNull
  @Override
  protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    View root = inflater.inflate(R.layout.item_song, parent, false);
    return new ViewHolder(root);
  }

  @Override
  protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Song song) {

  }

  static class ViewHolder extends RecyclerView.ViewHolder {

    ViewHolder(View itemView) {
      super(itemView);
    }
  }
}

package io.github.haohaozaici.muititypelearning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.haohaozaici.muititypelearning.CategoryViewBinder.ViewHolder;
import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by haoyuan on 2017/9/16.
 */

public class CategoryViewBinder extends ItemViewBinder<Category,ViewHolder> {


  @NonNull
  @Override
  protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    View root = inflater.inflate(R.layout.category_item_layout,parent,false);
    return new ViewHolder(root);
  }

  @Override
  protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Category item) {

  }

  static class ViewHolder extends RecyclerView.ViewHolder {


    public ViewHolder(View itemView) {
      super(itemView);
    }
  }

}

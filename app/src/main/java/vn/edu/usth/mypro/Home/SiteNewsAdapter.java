package vn.edu.usth.mypro.Home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class SiteNewsAdapter extends RecyclerView.Adapter<SiteNewsItemHolder> {
    private Context context;
    private ArrayList<SiteNewsModel> arrayList = SiteNewsModel.SiteNews;

    @NonNull
    @Override
    public SiteNewsItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.rv_sitenews_item, viewGroup, false);
        SiteNewsItemHolder holder = new SiteNewsItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SiteNewsItemHolder holder, int position) {
        SiteNewsModel item = arrayList.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

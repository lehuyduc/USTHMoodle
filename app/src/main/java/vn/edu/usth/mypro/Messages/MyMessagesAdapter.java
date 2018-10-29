package vn.edu.usth.mypro.Messages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class MyMessagesAdapter extends RecyclerView.Adapter<MyMessagesItemHolder> {

    private Context context;
    private ArrayList<MyMessageModel> arrayList = MyMessageModel.myMessages;

    @NonNull
    @Override
    public MyMessagesItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.rv_mymessages_item, viewGroup, false);
        MyMessagesItemHolder holder = new MyMessagesItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyMessagesItemHolder holder, int position) {
        MyMessageModel item = arrayList.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

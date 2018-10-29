package vn.edu.usth.mypro.Messages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsItemHolder> {

    private Context context;
    private ArrayList<ContactModel> arrayList = ContactModel.contacts;

    @NonNull
    @Override
    public ContactsItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.rv_contacts_item,viewGroup,false);
        ContactsItemHolder holder = new ContactsItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsItemHolder holder, int i) {
        ContactModel item = arrayList.get(i);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

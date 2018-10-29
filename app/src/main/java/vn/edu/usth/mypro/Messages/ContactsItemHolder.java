package vn.edu.usth.mypro.Messages;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;

public class ContactsItemHolder extends RecyclerView.ViewHolder{

    ContactModel data;

    @BindView(R.id.contact_avatar_imv)
    ImageView contactAvatarImv;

    @BindView(R.id.contact_name_tv)
    TextView contactNameTv;

    @BindView(R.id.contact_phone_tv)
    TextView contactPhoneTv;

    public ContactsItemHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(ContactModel contact) {
        data = contact;
        contactAvatarImv.setImageResource(contact.getImageID());
        contactNameTv.setText(contact.getName());
        contactPhoneTv.setText(contact.getPhoneNumber());
    }
}

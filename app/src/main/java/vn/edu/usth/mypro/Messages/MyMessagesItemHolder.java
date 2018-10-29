package vn.edu.usth.mypro.Messages;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;

public class MyMessagesItemHolder extends RecyclerView.ViewHolder{

    MyMessageModel data;

    @BindView(R.id.mymessages_avatar)
    ImageView avatarImv;

    @BindView(R.id.mymessages_sender)
    TextView senderTv;

    public MyMessagesItemHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(MyMessageModel person) {
        data = person;
        avatarImv.setImageResource(R.drawable.ic_avatar);
        senderTv.setText(person.getSender());
    }
}

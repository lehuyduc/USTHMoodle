package vn.edu.usth.mypro.Home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;

public class SiteNewsItemHolder extends RecyclerView.ViewHolder {

    SiteNewsModel data;

    @BindView(R.id.sitenews_imv)
    ImageView imv;

    @BindView(R.id.sitenews_tv)
    TextView tv;

    @BindView(R.id.sitenews_btn)
    Button btn;

    public SiteNewsItemHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(SiteNewsModel news) {
        data = news;
        imv.setImageResource(news.getImageID());
        tv.setText(news.getTitle());
        btn.setBackgroundResource(R.drawable.download);
    }
}

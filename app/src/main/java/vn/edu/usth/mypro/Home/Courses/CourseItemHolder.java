package vn.edu.usth.mypro.Home.Courses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vn.edu.usth.mypro.R;

public class CourseItemHolder extends RecyclerView.ViewHolder {

    CourseModel data;

    @BindView(R.id.courses_item_imv)
    ImageView subjectImage;

    @BindView(R.id.courses_item_tv)
    TextView subjectName;

    public CourseItemHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    void bind(CourseModel course) {
        data = course;
        //subjectImage.setImageResource();
        subjectName.setText(course.getSubjectName());
    }
}

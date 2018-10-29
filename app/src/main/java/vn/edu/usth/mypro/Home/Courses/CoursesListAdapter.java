package vn.edu.usth.mypro.Home.Courses;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class CoursesListAdapter extends RecyclerView.Adapter<CourseItemHolder> {
    private Context context;
    private ArrayList<CourseModel> arrayList = CourseModel.coursesList;

    @NonNull
    @Override
    public CourseItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.rv_courses_item, viewGroup, false);
        CourseItemHolder holder = new CourseItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseItemHolder holder, int position) {
        CourseModel item = arrayList.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

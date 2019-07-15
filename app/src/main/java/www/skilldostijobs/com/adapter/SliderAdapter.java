package www.skilldostijobs.com.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import www.skilldostijobs.com.R;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] walkthrough_images={
            R.drawable.walkthrough_one_xhdpi,
            R.drawable.walkthrough_two_xhdpi,
            R.drawable.walkthrough_three_xhdpi
    };

    public String[] headings ={
            "FIND JOBS","FIND JOBS IN", "FIND JOBS IN"
    };

    public String[] descriptions={
            "Search, Sort and filter to find just\n" +
                    "the right jobs for you.",
            "Musician,  Architect, Designers\n" +
                    "Acting, Advertising ,Marketing\n" +
                    "and Many more.......\n",
            "Search, Sort and filter to find just\n" +
                    "the right jobs for you."
    };

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=  layoutInflater.inflate(R.layout.slider_layout,container,false);
        TextView heading = view.findViewById(R.id.walkthrough_heading);
        TextView description = view.findViewById(R.id.walkthrough_description);
        ImageView imageView = view.findViewById(R.id.walkthrough_layouts);

        imageView.setBackground(context.getResources().getDrawable(walkthrough_images[position]));
        heading.setText(headings[position]);
        description.setText(descriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}

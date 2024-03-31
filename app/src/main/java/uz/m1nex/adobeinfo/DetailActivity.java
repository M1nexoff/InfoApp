package uz.m1nex.adobeinfo;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private final List<Program> list = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        loadData();

        int pos = getIntent().getIntExtra("program", 0);
        ArrayList<Program> data = new ArrayList<>();
        list.forEach(v->{
            if(v.getImgResId() == pos){
                data.add(v);
            }
        });

        findViewById(R.id.buttonBack).setOnClickListener(v -> finish());

        TextView textView = findViewById(R.id.name);
        textView.setText(data.get(0).getProgramName());

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(data.get(0).getImgResId());

        TextView textDescription = findViewById(R.id.textDescription);
        textDescription.setText(data.get(0).getProgramDescription());
    }
    private void loadData() {
        list.add(new Program(R.drawable.after_effects, "Adobe After Effects", "Video Editing", Color.parseColor("#D9000058"), R.string.after_effects_description));
        list.add(new Program(R.drawable.aero, "Adobe Aero", "Augmented Reality", Color.parseColor("#D9223008"), R.string.aero_description));
        list.add(new Program(R.drawable.dreamweaver, "Adobe Dreamweaver", "Web Design", Color.parseColor("#D9410A35"), R.string.dreamweaver_description));
        list.add(new Program(R.drawable.photoshop, "Adobe Photoshop", "Image Editing", Color.parseColor("#D9071D34"), R.string.photoshop_description));
        list.add(new Program(R.drawable.in_copy, "Adobe InCopy", "Editorial Collaboration", Color.parseColor("#D9430C1F"), R.string.in_copy_description));
        list.add(new Program(R.drawable.premier_pro, "Adobe Premiere Pro", "Video Editing", Color.parseColor("#D9000058"), R.string.premiere_pro_description));
        list.add(new Program(R.drawable.illustrator, "Adobe Illustrator", "Vector Graphics", Color.parseColor("#D92E0501"), R.string.illustrator_description));
        list.add(new Program(R.drawable.dimension, "Adobe Dimension", "3D Design", Color.parseColor("#D9223008"), R.string.dimension_description));
        list.add(new Program(R.drawable.adobe_stock, "Adobe Stock", "Stock Photography", Color.parseColor("#D9020B1C") , R.string.adobe_stock));
        list.add(new Program(R.drawable.fresco, "Adobe Fresco", "Digital Painting", Color.parseColor("#D9071D34"), R.string.fresco_description));
        list.add(new Program(R.drawable.animate, "Adobe Animate", "Animation", Color.parseColor("#D9000058"), R.string.animate_description));
        list.add(new Program(R.drawable.in_design, "Adobe InDesign", "Desktop Publishing", Color.parseColor("#D9430C1F"), R.string.in_design_description));
        list.add(new Program(R.drawable.audition, "Adobe Audition", "Audio Editing", Color.parseColor("#D9000058"), R.string.audition_description));
        list.add(new Program(R.drawable.bridge, "Adobe Bridge", "Media Management", Color.parseColor("#D9020B1C"), R.string.bridge_description));
        list.add(new Program(R.drawable.media_encoder, "Adobe Media Encoder", "Media Encoding", Color.parseColor("#D9000058"), R.string.media_encoder_description));
        list.add(new Program(R.drawable.xd, "Adobe XD", "UI/UX Design", Color.parseColor("#D9410A35"), R.string.xd_description));
        list.add(new Program(R.drawable.character_animator, "Adobe Character Animator", "Animation", Color.parseColor("#D9000058"), R.string.character_animator_description));
        list.add(new Program(R.drawable.lightroom, "Adobe Lightroom", "Photo Editing", Color.parseColor("#D9071D34"), R.string.lightroom_description));
        list.add(new Program(R.drawable.premier_rush, "Adobe Premiere Rush", "Video Editing", Color.parseColor("#D9000058"), R.string.premiere_rush_description));
    }
}
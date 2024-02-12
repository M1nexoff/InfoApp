package uz.m1nex.adobeinfo;

import android.annotation.SuppressLint;
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
        Window w = getWindow();
        w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        loadData();

        int pos = getIntent().getIntExtra("program", 0);
        Program data = list.get(pos);

        findViewById(R.id.buttonBack).setOnClickListener(v -> finish());

        TextView textView = findViewById(R.id.name);
        textView.setText(data.getProgramName());

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(data.getImgResId());

        TextView textDescription = findViewById(R.id.textDescription);
        textDescription.setText(data.getProgramDescription());
    }
    private void loadData() {
        list.add(new Program(R.drawable.adobe_stock, "Adobe Stock", "Stock Photography", R.string.adobe_stock));
        list.add(new Program(R.drawable.after_effects, "Adobe After Effects", "Video Editing", R.string.after_effects_description));
        list.add(new Program(R.drawable.aero, "Adobe Aero", "Augmented Reality", R.string.aero_description));
        list.add(new Program(R.drawable.animate, "Adobe Animate", "Animation", R.string.animate_description));
        list.add(new Program(R.drawable.audition, "Adobe Audition", "Audio Editing", R.string.audition_description));
        list.add(new Program(R.drawable.bridge, "Adobe Bridge", "Media Management", R.string.bridge_description));
        list.add(new Program(R.drawable.character_animator, "Adobe Character Animator", "Animation", R.string.character_animator_description));
        list.add(new Program(R.drawable.dimension, "Adobe Dimension", "3D Design", R.string.dimension_description));
        list.add(new Program(R.drawable.dreamweaver, "Adobe Dreamweaver", "Web Design", R.string.dreamweaver_description));
        list.add(new Program(R.drawable.fresco, "Adobe Fresco", "Digital Painting", R.string.fresco_description));
        list.add(new Program(R.drawable.illustrator, "Adobe Illustrator", "Vector Graphics", R.string.illustrator_description));
        list.add(new Program(R.drawable.in_copy, "Adobe InCopy", "Editorial Collaboration", R.string.in_copy_description));
        list.add(new Program(R.drawable.in_design, "Adobe InDesign", "Desktop Publishing", R.string.in_design_description));
        list.add(new Program(R.drawable.lightroom, "Adobe Lightroom", "Photo Editing", R.string.lightroom_description));
        list.add(new Program(R.drawable.media_encoder, "Adobe Media Encoder", "Media Encoding", R.string.media_encoder_description));
        list.add(new Program(R.drawable.photoshop, "Adobe Photoshop", "Image Editing", R.string.photoshop_description));
        list.add(new Program(R.drawable.premier_pro, "Adobe Premiere Pro", "Video Editing", R.string.premiere_pro_description));
        list.add(new Program(R.drawable.premier_rush, "Adobe Premiere Rush", "Video Editing", R.string.premiere_rush_description));
        list.add(new Program(R.drawable.xd, "Adobe XD", "UI/UX Design", R.string.xd_description));
    }


}
package ru.example.mygallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class ImgviewActivity extends AppCompatActivity {
    int position;
    String[] List;
    //принимаем интент, где указана позиця и путь к файлу и открываем его 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgview);
        Intent intent = getIntent();
        /*
        В переменые List и position помещаем сохраненые значения.
        В photoView помещаем картинку.
         */
        List = intent.getStringArrayExtra("pathList");
        position = intent.getIntExtra("Position", 0);
        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageBitmap(BitmapFactory.decodeFile(List[position]));
    }
}

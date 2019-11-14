package Vistula.xy.firma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DrugieActivity_46481 extends AppCompatActivity {

    TextView tv_46481_imiePobrane;
    TextView tv_46481_nazwiskoPobrane;
    TextView tv_46481_sumaPobrana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drugie_46481);

        tv_46481_imiePobrane = findViewById(R.id.tv_46481_imiePobrane);
        tv_46481_nazwiskoPobrane = findViewById(R.id.tv_46481_nazwiskoPobrane);
        tv_46481_sumaPobrana = findViewById(R.id.tv_46481_sumaPobrana);

        String name = getIntent().getStringExtra("name");

        tv_46481_imiePobrane.setText(name);

        String surname = getIntent().getStringExtra("surname");

        tv_46481_nazwiskoPobrane.setText(surname);

    }
}

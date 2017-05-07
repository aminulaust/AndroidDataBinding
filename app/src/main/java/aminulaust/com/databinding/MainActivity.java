package aminulaust.com.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import aminulaust.com.databinding.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {
    MainActivityBinding binding;

    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.main_activity);
        final MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity); // Same as xml layout name

        //binding.fName.setText("Aminul");
        // binding.lName.setText("Islam");

        //Student student=new Student("Aminul", "Islam");
        final Student student = new Student();
        binding.setStudent(student);
        binding.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //binding.setStudent(student);
               // Toast.makeText(getApplicationContext(),binding.fNameET.getText().toString(), Toast.LENGTH_SHORT).show();
                String myFname=binding.fNameET.getText().toString();
                String myLname=binding.lNameET.getText().toString();
                Student student=new Student(myFname, myLname);
                binding.setStudent(student);

            }
        });
    }
/*
    public void ShowName(View view){
       // Student student1=new Student(binding.fNameET.getText().toString(),binding.lNameET.getText().toString());
        binding.setStudent(student);

    }
    */
}

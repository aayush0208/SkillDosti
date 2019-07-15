package www.skilldostijobs.com;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginSignUp extends AppCompatActivity implements Constants {
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
    }

    public void register(View view){
        Intent intent = new Intent(context,SignInRegister.class);
        intent.putExtra(REGISTER,Y);
        startActivity(intent);
    }

    public void signin(View view){
        Intent intent = new Intent(context,SignInRegister.class);
        intent.putExtra(SIGN_IN,Y);
        startActivity(intent);
    }
}

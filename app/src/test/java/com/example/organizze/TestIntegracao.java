package com.example.organizze;

import android.content.Intent;
import android.os.Build;
import android.widget.Button;

import com.example.organizze.activity.CadastroActivity;
import com.example.organizze.activity.MainActivity;
import com.example.organizze.config.ConfiguracaoFirebase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.w3c.dom.Text;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@Config(sdk = {Build.VERSION_CODES.O_MR1})
@RunWith(RobolectricTestRunner.class)
public class TestIntegracao {

        MainActivity mainActivity;

        @Mock
        ConfiguracaoFirebase configuracaoFirebase = new ConfiguracaoFirebase();

        @Before
        public void setUp() throws Exception
        {

            mainActivity = Robolectric.buildActivity( MainActivity.class )
                    .create()
                    .resume()
                    .get();

        }

        @Test
        public void testSeActivityCriou() throws Exception {
            assertNotNull(mainActivity);
        }

        @Test
        public void testButtonClickStartNewActivity() throws Exception
        {
            Button button = mainActivity.findViewById( R.id.button );
            button.performClick();
            Intent intent = Shadows.shadowOf(mainActivity).peekNextStartedActivity();
            assertEquals(CadastroActivity.class.getCanonicalName(), intent.getComponent().getClassName());
        }

}

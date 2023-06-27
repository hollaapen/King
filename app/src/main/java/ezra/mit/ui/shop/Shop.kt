package ezra.mit.ui.shop



import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.spacing

@Composable
fun ShopScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    
    Row() {
        
        Text(text = "shop page")
        
    }
    
    
    
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ShopScreenPreviewLight() {
    ShopScreen(null, rememberNavController())
}



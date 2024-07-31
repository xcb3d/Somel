package com.example.loginscreen

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.loginscreen.ui.theme.Black
import com.example.loginscreen.ui.theme.textFieldContainer
import com.example.loginscreen.ui.theme.unfocusedTextFieldText

@Composable
fun LoginTextField(modifier: Modifier = Modifier, label: String, trailing: String) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black
    TextField(
        modifier = modifier,
        onValueChange = {},
        value = "",
        label = {
            Text(
                text = label,
                color = uiColor
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
            unfocusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
            focusedIndicatorColor = MaterialTheme.colorScheme.textFieldContainer,
        ),
        trailingIcon = {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = trailing, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium), color = uiColor)

            }
        }

    )
}
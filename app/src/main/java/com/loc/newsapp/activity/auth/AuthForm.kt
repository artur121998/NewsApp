package com.loc.newsapp.activity.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.newsapp.R
import com.loc.newsapp.ui.theme.Typography
import com.loc.newsapp.ui.theme.darkBlue
import com.loc.newsapp.ui.theme.greyBorder
import com.loc.newsapp.ui.theme.placeholder
import com.loc.newsapp.ui.theme.switchColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthForm() {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val rememberMe = remember { mutableStateOf(true) }
    Box() {
        BackgroundForm()
        Column {
            LogoBox()
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 29.dp, top = 34.dp, end = 29.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.app_auth_signin),
                    style = Typography.headlineMedium
                )

                OutlinedTextField(
                    value = email.value,
                    onValueChange = { email.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 17.dp)
                        .border(1.dp, greyBorder, RoundedCornerShape(12)),
                    shape = RoundedCornerShape(12),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.app_auth_placeholder_email),
                            style = TextStyle(color = placeholder)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_auth_email),
                            contentDescription = null
                        )
                    }
                )
                OutlinedTextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 17.dp)
                        .border(1.dp, greyBorder, RoundedCornerShape(12)),
                    shape = RoundedCornerShape(12),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.app_auth_placeholder_password),
                            style = TextStyle(color = placeholder)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_auth_lock),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_auth_password_hidden),
                            contentDescription = null,
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp)
                        )
                    }
                )
                Spacer(
                    modifier = Modifier
                        .height(5.dp)
                        .fillMaxWidth()
                )
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.align(Alignment.TopStart)
                    ) {
                        Switch(
                            checked = rememberMe.value,
                            onCheckedChange = { rememberMe.value = it },
                            modifier = Modifier
                                .scale(0.58f)
                                .offset(x = (-12).dp),
                            colors = SwitchDefaults.colors(
                                checkedBorderColor = switchColor,
                                checkedTrackColor = switchColor
                            )
                        )
                        Text(
                            text = stringResource(id = R.string.app_auth_rememberme),
                            style = Typography.bodySmall
                        )
                    }
                    Text(
                        text = stringResource(id = R.string.app_auth_forgot_password),
                        style = Typography.bodySmall,
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(58.dp)
                        .padding(start = 52.dp, end = 52.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = switchColor
                    ),
                    shape = RoundedCornerShape(15),
                    contentPadding = PaddingValues(14.dp)
                ) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = stringResource(id = R.string.app_auth_button_sign_in),
                            style = Typography.bodyMedium,
                            modifier = Modifier.align(Alignment.Center)
                        )
                        Box(
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                                .background(darkBlue, CircleShape)
                                .align(Alignment.CenterEnd)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_right),
                                contentDescription = null,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }

                }
            }

        }
    }
}

@Composable
fun LogoBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_logo_event),
            contentDescription = null, // decorative element
            Modifier
                .align(Alignment.TopCenter)
                .padding(top = 73.dp),
            tint = Color.Unspecified
        )
        Text(
            text = stringResource(id = R.string.app_name),
            style = Typography.titleMedium,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 139.dp)
        )
    }
}


@Preview
@Composable
fun AuthFormPreview() {
    AuthForm()
}
package com.lumec.liga.app.presentation.details.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.lumec.liga.app.R
import com.lumec.liga.app.domain.model.Team

@Composable
fun SocialNetworksSection(team: Team) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        SocialNetworkIcon(iconPath = getIconPath(Icon.Facebook), url = team.facebook)
        SocialNetworkIcon(iconPath = getIconPath(Icon.Instagram), url = team.instagram)
        SocialNetworkIcon(iconPath = getIconPath(Icon.Website), url = team.website)
        SocialNetworkIcon(iconPath = getIconPath(Icon.Twitter), url = team.twitter)
        SocialNetworkIcon(iconPath = getIconPath(Icon.Youtube), url = team.youtube)
    }
}


@Composable
fun SocialNetworkIcon(
    iconPath: Int,
    url: String,
) {
    if (url.isNotBlank()) {

        val context = LocalContext.current

        Image(
            painter = painterResource(id = iconPath),
            modifier = Modifier
                .size(50.dp)
                .clickable {
                    val validUrl = if(
                        !url.startsWith("http://") || !url.startsWith("https://")
                    ) {
                        "https://$url"
                    } else {
                        url
                    }
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(validUrl))
                    context.startActivity(intent)
                },
            contentDescription = null,
        )
    }
}

sealed class Icon {
    object Facebook : Icon()
    object Instagram : Icon()
    object Website : Icon()
    object Twitter : Icon()
    object Youtube : Icon()
}

fun getIconPath(icon: Icon): Int {
    return when (icon) {
        Icon.Facebook -> {
            R.drawable.facebook_icon
        }

        Icon.Instagram -> {
            R.drawable.instagram_icon
        }

        Icon.Twitter -> {
            R.drawable.twitter_icon
        }

        Icon.Website -> {
            R.drawable.website_icon
        }

        Icon.Youtube -> {
            R.drawable.youtube_icon
        }
    }
}




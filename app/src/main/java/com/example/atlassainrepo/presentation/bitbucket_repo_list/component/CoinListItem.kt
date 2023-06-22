package com.example.atlassainrepo.presentation.bitbucket_repo_list.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.atlassainrepo.domain.model.BitbucketRepoList



@Composable
fun BitbucketListItem(
    bitbucketRepoList: BitbucketRepoList,
    onItemClick: (BitbucketRepoList) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(bitbucketRepoList) }
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = bitbucketRepoList.full_name,
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = bitbucketRepoList.owner.display_name,
            color = Color.Green,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.body2
        )
    }
}
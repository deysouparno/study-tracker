package com.example.studytracker.ui.theme.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studytracker.ui.theme.components.CountCard

@Composable
fun DashboardScreen() {
    Scaffold(
        topBar = { TopBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                Row(
                    modifier = Modifier.fillParentMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    CountCard(
                        modifier = Modifier.weight(1f),
                        headingText = "Subject Count",
                        count = "10"
                    )
                    CountCard(
                        modifier = Modifier.weight(1f),
                        headingText = "Subject Count",
                        count = "10"
                    )
                    CountCard(
                        modifier = Modifier.weight(1f),
                        headingText = "Subject Count",
                        count = "10"
                    )
                }
            }


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    CenterAlignedTopAppBar(title = {
        Text(text = "StudyTracker", style = MaterialTheme.typography.headlineMedium)
    })
}

@Preview
@Composable
private fun DashboardScreenPreview() {
    DashboardScreen()
}
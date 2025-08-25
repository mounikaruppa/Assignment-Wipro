import { Component } from '@angular/core';
import { NgForOf } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-music-playlist',
  standalone: true,
  imports: [NgForOf, MatCardModule, MatButtonModule],
  templateUrl: './music-playlist.html',
  styleUrls: ['./music-playlist.css']
})
export class MusicPlaylistComponent {
  songs = [
    { title: 'Love Story', album: 'Fearless', cover: 'https://upload.wikimedia.org/wikipedia/en/8/86/Taylor_Swift_-_Fearless.png' },
    { title: 'Blank Space', album: '1989', cover: 'https://upload.wikimedia.org/wikipedia/en/f/f6/Taylor_Swift_-_1989.png' },
    { title: 'Anti-Hero', album: 'Midnights', cover: 'https://upload.wikimedia.org/wikipedia/en/f/f6/Taylor_Swift_-_Midnights.png' }
  ];
}

import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FeedbackComponent } from './feedback/feedback.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FeedbackComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'feedback-form-app';
}

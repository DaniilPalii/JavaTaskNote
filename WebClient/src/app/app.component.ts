import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  public title = 'Hello, Angular!';
  public response = 'loading...';

  public constructor(private httpClient: HttpClient) {
  }

  public ngOnInit(): void {
    this.httpClient.get('/api/greeting', { responseType: "text" })
      .subscribe(response => this.response = response);
  }
}


import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './full-layout.component.html',
  styleUrls: ['./full-layout.component.scss']
})
export class FullLayoutComponent implements OnInit {
  showSlider = false;
  constructor(public router: Router) {
    if (this.router.url == '/') {
      this.showSlider = true;
    }
  }

  ngOnInit(): void {
    if (this.router.url == '/') {
      this.showSlider = true;
    }
  }
}

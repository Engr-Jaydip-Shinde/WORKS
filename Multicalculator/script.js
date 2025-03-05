const hamburger = document.querySelector('.hamburger');
const navLinks = document.querySelector('.nav-links');

hamburger.addEventListener('click', () => {
  navLinks.classList.toggle('active');
  hamburger.classList.toggle('toggle');
  const lines = hamburger.querySelectorAll('.line');
  lines.forEach((line, index) => {
    line.style.transform = hamburger.classList.contains('toggle')
      ? `rotate(${15 * (index + 1)}deg)`
      : 'rotate(0)';
  });
});



document.addEventListener("DOMContentLoaded", function () {
    const wrapper = document.querySelector(".symbols-wrapper");
    const symbols = wrapper.innerHTML; 
    while (wrapper.scrollWidth < window.innerWidth * 2) {
      wrapper.innerHTML += symbols;
    }
  });

 
 //Carosol cards 
  let currentIndex = 0;
  const slides = document.querySelectorAll('.quote-slide');
  const totalSlides = slides.length;
  const carousel = document.querySelector('.carousel');
  
  function showNextSlide() {
    currentIndex++;
    carousel.style.transition = 'transform 0.8s ease-in-out';
    const offset = -currentIndex * 100; 
    carousel.style.transform = `translateX(${offset}%)`;
    if (currentIndex === totalSlides) {
      setTimeout(() => {
        carousel.style.transition = 'none'; 
        currentIndex = 0; 
        carousel.style.transform = 'translateX(0)'; 
      }, 3000); 
    }
  }
  setInterval(showNextSlide, 3000);
  
  //  DROPDWON CARDS
document.querySelectorAll('.custom-button').forEach(button => {
  button.addEventListener('click', () => {
    const menuID = button.id.replace('button', 'menu');
    const dropdown = document.getElementById(menuID);
    dropdown.style.display = dropdown.style.display === 'block' ? 'none' : 'block';
  });
});

document.addEventListener('click', (event) => {
  const isInsideDropdown = event.target.matches('.custom-button') || event.target.matches('.custom-dropdown') || event.target.matches('.custom-option');
  if (!isInsideDropdown) {
    document.querySelectorAll('.custom-dropdown').forEach(menu => menu.style.display = 'none');
  }
});

// smooth scroll
document.querySelectorAll('.scroll-link').forEach(link => {
  link.addEventListener('click', function(e) {
    e.preventDefault(); 
    const targetID = this.getAttribute('href').substring(1); 
    const targetElement = document.getElementById(targetID);
    if (targetElement) {
      window.scrollTo({
        top: targetElement.offsetTop,
        behavior: 'smooth'
      });
    }
  });
});

    
//footer submission
document.querySelectorAll('.ajax-form').forEach(form => {
  form.addEventListener('submit', function (e) {
    e.preventDefault(); 
    const formData = new FormData(this); 
    formData.append('type', this.getAttribute('data-type')); 
    const responseDiv = this.querySelector('.form-response');
    fetch('http://127.0.0.1:5000/submit', {
      method: 'POST',
      body: formData
    })
      .then(response => response.json())
      .then(data => {
        if (data.status === 'success') {
          responseDiv.textContent = "Submitted successfully!";
          responseDiv.style.color = 'green';

          this.reset();
        } 
      });
  });
});

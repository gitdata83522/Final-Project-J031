import { Link } from 'react-router-dom'

function Navbar() {
  return (
    <nav
      className='navbar navbar-expand-lg bg-body-tertiary bg-dark'
      data-bs-theme='dark'
    >
      <div className='container-fluid'>
        <a className='navbar-brand' href='#'>
          Mobile Store
        </a>

        <div className='collapse navbar-collapse' id='navbarSupportedContent'>
          <ul className='navbar-nav me-auto mb-2 mb-lg-0'>
            <li className='nav-item'>
              <Link
                to='/home'
                className='nav-link'
                aria-current='page'
                href='#'
              >
                Home
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                to='/properties'
                className='nav-link'
                aria-current='page'
                href='#'
              >
               Properties
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                to='/users'
                className='nav-link'
                aria-current='page'
                href='#'
              >
                Users
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                to='/bookings'
                className='nav-link'
                aria-current='page'
                href='#'
              >
                Bookings
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                to='/login'
                className='nav-link'
                aria-current='page'
                href='#'
              >
                Logout
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                to='/register'
                className='nav-link'
                aria-current='page'
                href='#'
              >
                Register
              </Link>
            </li>
          </ul>
          
        </div>
      </div>
        
               <div class="dropdown">
                <div class="d-grid gap-2 d-md-flex justify-content-md-end"></div>
                 <button class="btn btn-primary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Login
                 </button>
                 <ul class="dropdown-menu">
                    <li><button class="dropdown-item" type="button">User</button></li>
                    <li><button class="dropdown-item" type="button">Admin</button></li>
                    
                </ul>
    </div>
    </nav>
  )
}

export default Navbar

import { Route, Routes } from 'react-router-dom'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'

import Login from './screens/Login'
import Register from './screens/Register'
import Home from './screens/Home'
import Bookings from './screens/Bookings'
import Properties from './screens/Properties'
import MobileDetails from './screens/MobileDetails'
import Users from './screens/Users'
import UserDetails from './screens/UserDetails'
import AddMobile from './screens/AddMobile'
//import Mobiles from './screens/Properties'

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='' element={<Login />} />
        <Route path='login' element={<Login />} />
        <Route path='register' element={<Register />} />
        <Route path='home' element={<Home />} />
        
        <Route path='bookings' element={<Bookings />} />
        {/* <Route path='mobiles' element={<Mobiles />} /> */}
        <Route path='properties' element={<Properties />} />

        <Route path='mobile-details' element={<MobileDetails />} />
        <Route path='users' element={<Users />} />
        <Route path='user-details' element={<UserDetails />} />
        <Route path='add-mobile' element={<AddMobile />} />
        
      </Routes>
      <ToastContainer />
    </div>
  );
}

export default App;

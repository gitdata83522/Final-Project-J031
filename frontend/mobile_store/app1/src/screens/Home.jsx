import DashboardItem from '../components/dashboardItem'
import Navbar from "../components/navbar"
import './Home.css'

function Home (){
return (
    <div>
        <Navbar />
        <div className="home">
            <div className="header-contents">
                <h2>Order your favourite mobile here</h2>
                <p>The Mobile Store is a successful and growing business at the heart of the mobile phone sector which serves diverse customers through our retail.
                Maintaining high quality and ensuring high standards of corporate responsibility have also served us well since we set up more than a decade ago. 
                We have gained the international quality system approval ISO 9000: 2001.We strive to build and maintain close links with customers and suppliers throughout the supply chain. We expect all our associates to comply with international standards of business practice while carrying out smartphone repair, computer repair, tablet repair and to adhere to social, ethical and environmental responsibilities.
                </p>
            </div>
        </div>
        <h2 className='page-header'>Home</h2>
      <div className='row mt-5'>
        <div className='col'>
          <DashboardItem title='Users' value='100K' />
        </div>
        <div className='col'>
          <DashboardItem title='Properties' value='100K' />
        </div>
        <div className='col'>
          <DashboardItem title='Bookings' value='10K' />
        </div>
        <div className='col'>
          <DashboardItem title='Revenue' value='$100b' />
        </div>
      </div>
    </div>
)
}

export default Home
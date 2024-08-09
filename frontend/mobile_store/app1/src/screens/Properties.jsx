// import { Link, useNavigate } from 'react-router-dom';
// import Navbar from '../components/navbar';
// import { useEffect, useState } from 'react';
// import { getProperties } from '../services/properties';  // Correct import
// import { config } from '../services/config';

// function Properties() {
//   const [properties, setProperties] = useState([]);
//   const navigate = useNavigate();

//   const loadProperties = async () => {
//     const result = await geProperties();
//     if (result['status'] === 'success') {
//       setProperties(result['data']);
//     }
//   };

//   useEffect(() => {
//     loadProperties();
//   }, []);

//   const onDelete = (index) => {
//     mobiles.splice(index, 1);
//     setProperties([...mobiles]);
//   };

//   const onDetails = (index) => {
//     navigate('/mobile-details')
//   }

//   return (
//     <div>
//       <Navbar />
//       <h2 className='page-header'>Mobiles</h2>
//       <Link to='/add-mobile' className='btn btn-primary'>
//         Add Mobile
//       </Link>
//       {properties.length === 0 && (
//         <h3 className='mt-5' style={{ textAlign: 'center' }}>
//           There are no mobiles at the moment. Please use Add Mobile button to add one.
//         </h3>
//       )}

//       {mobiles.length > 0 && (
//         <table className='table table-striped mt-5'>
//           <thead>
//             <tr>
//               <th>#</th>
//               <th></th>
//               <th>Brand</th>
//               <th>Model</th>
//               <th>Price</th>
//               <th>Actions</th>
//             </tr>
//           </thead>
//           <tbody>
//             {mobiles.map((mobile, index) => (
//               <tr key={index}>
//                 <td>{index + 1}</td>
//                 <td>
//                   <img
//                     style={{ width: 100, height: 100 }}
//                     src={`${config.serverUrl}/image/${mobile['profileImage']}`}
//                     alt=''
//                   />
//                 </td>
//                 <td>{mobile['brand']}</td>
//                 <td>{mobile['model']}</td>
//                 <td>{mobile['price']}</td>
//                 <td>
//                   <button
//                     onClick={() => onDelete(index)}
//                     className='btn btn-danger btn-sm me-2'
//                   >
//                     Delete
//                   </button>
//                   <button
//                     onClick={() => onDetails(index)}
//                     className='btn btn-primary btn-sm'
//                   >
//                     Details
//                   </button>
//                 </td>
//               </tr>
//             ))}
//           </tbody>
//         </table>
//       )}
//     </div>
//   );
// }

// export default Properties;
